package ch19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class DateClient {
	public static void main(String[] args) throws Exception {
		// new Socket("IP주소", 포트번호);
		// localhost(내아이피) = 127.0.0.1
		Socket s = new Socket("localhost", 8000);
		BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
		// 서버에서 보낸 메시지를 받음
		String res = input.readLine();
		System.out.println(res);
		// 소켓닫기(연결종료)
		s.close();
		// 프로그램 종료
		System.exit(0);
	}

}
