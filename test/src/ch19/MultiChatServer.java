package ch19;

import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// GUI 관련 클래스
class ServerScreen extends JFrame {
	JTextArea ta;
	JTextField tf;
	
	public ServerScreen() {
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("채팅방 서버");
		setLayout(new BorderLayout());
		JLabel label = new JLabel("This is a server!");
		add(label, BorderLayout.NORTH);
		setVisible(true);
	}
}

public class MultiChatServer {
	HashMap userMap;
	
	public MultiChatServer() {
		userMap = new HashMap();
		Collections.synchronizedMap(userMap);
	}
	
	public static void main(String[] args) {
		// 화면만 띄움
		new ServerScreen();
		// 서비스 개시
		new MultiChatServer().serviceStart();
	}

	private void serviceStart() {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("서버가 시작되었습니다.");
			while (true) {
				// 클라이언트의 접속을 기다리다 접속하면 접속을 허가함(통신용 소켓이 생성됨)
				socket = serverSocket.accept();
				System.out.println("["+socket.getInetAddress()+"]"
						+ "에서 접속하셨습니다.");
				
				ServerReceiver receiveThread = new ServerReceiver(socket);
				receiveThread.start();
				System.out.println("현재 실행중인 쓰레드 이름 : "+receiveThread.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 현재 접속중인 모든 사용자에게 메시지를 전송
	void sendToAll(String msg) {
		// 메시지를 받아서 일괄 전송(HashMap에서 Key값들의 집합을 리턴받음)
		Iterator it = userMap.keySet().iterator();
		while (it.hasNext()) {
			try {
				// 메시지 전송을 위한 출력스트림 생성
				DataOutputStream out = (DataOutputStream) userMap.get(it.next());
				// 메시지 전송
				out.writeUTF(msg);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	// 메시지 수신관련 클래스
	class ServerReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		
		public ServerReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				System.out.println("ServerReceiver 소켓 IO 에러");
			}
		}
		
		@Override
		public void run() {
			String name = "";
			try {
				// 메시지 수신
				name = in.readUTF();
				// 메시지 보내기
				sendToAll("#"+name+"님이 들어오셧습니다.");
				// HashMap에 사용자 추가
				userMap.put(name, out);
				System.out.println("현재 접속자 수는 "+userMap.size()+"입니다.");
				while (in != null) {
					// 받은 메시지를 모든 사용자에게 보냄
					sendToAll(in.readUTF());
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				// 대화방을 나간 사용자의 정보 출력
				sendToAll("#"+name+"님이 나가셨습니다.");
				// HashMap에서 제거
				userMap.remove(name);
				System.out.println("["+socket.getInetAddress()+":"
						+socket.getPort()+"] 에서 접속을 종료함");
				System.out.println("현재 접속자 수는 "+userMap.size()+"입니다.");
			}
		}
	}
	
} // MultiChatServer

