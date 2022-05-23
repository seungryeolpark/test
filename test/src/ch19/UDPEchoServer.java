package ch19;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

// UDP 방식 - 비연결성(단방향 전송)
// TCP 방식 - 연결성(서버와 클라이언트가 서로 연결된 상태에서 데이터 송수신)

public class UDPEchoServer {
	public UDPEchoServer(int port) {
		try {
			// UDP 방식
			DatagramSocket ds = new DatagramSocket(port);
			while (true) {
				// UDP 방식은 데이터를 바이트배열로 전송함.(String을 바로 보낼수 없음)
				// (참고:바이트배열의 최대크기는 65508)
				byte buffer[] = new byte[512];
				// UDP 방식의 통신은 데이터를 패킷(데이터 조각)으로 만들어 전송
				DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
				System.out.println("ready");
				// 클라이언트가 보낸 메세지를 수신
				// 소켓을 통해 수신된 클라이언트의 메시지를 DatagramPacket에 저장
				ds.receive(dp);
				// 클라이언트에서 보낸 메시지(바이트배열)를 스트림으로 변환
				// new String(바이트배열) ==> 문자열로 변환
				String str = new String(dp.getData());
				System.out.println("클라이언트에서 보낸 메시지 : "+str);
				// 클라이언트측 ip주소 get
				InetAddress ia = dp.getAddress();
				// port번호 get
				port = dp.getPort();
				System.out.println("client ip : "+ia+", client port"+port);
				// 클라이언트에게 전송할 패킷객체 생성
				// (바이트배열, 바이트배열크기, ip주소, port번호)
				dp = new DatagramPacket(dp.getData(), dp.getData().length, ia, port);
				// 클라이언트에게 자료 전송
				ds.send(dp);
				ds.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // Constructor
	
	public static void main(String[] args) throws Exception {
		new UDPEchoServer(3000);
	}

}
