package ch19;

import java.net.ServerSocket;
import java.net.Socket;

public class SocketExam {
	public static void main(String[] args) {
		// 서버소켓 : 서버에서 서비스를 위한 목적으로 만드는 소켓
		// Server용 소켓
		ServerSocket socket = null;
		// Client용 소켓
//		Socket cSoket = null;
		// 포트(port)번호 : 0~65535 내에 배정이 가능하고 중복되지 않아야 함.
		// 1port 당 1service 원칙
		// well known port number(자주 사용하는 포트 번호)
		// 80 : 웹 서비스, 21 : ftp서비스, 445 : 파일공유, 3389 : 원격접속...
		
		for(int i=0; i<=65535; i++) {
			try {
				// 서버 소켓 생성
				socket = new ServerSocket(i);
				// 소켓 서비스 종료
				socket.close();
			} catch (Exception e) {
				// 사용중인 포트는 피해서 사용해야 한다.
				System.out.println(i+"번 포트는 사용중입니다.");
			}
		}
	}

}
