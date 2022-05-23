package ch19;

import java.net.InetAddress;

public class InetAddressExam {
	public static void main(String[] args) {
		// 네트워크 프록그램도 예외처리 필수
		try {
			InetAddress address = InetAddress.getByName("google.com");
			// 호스트이름, ip주소
			System.out.println(address);
			// 호스트이름(도메인 이름)
			System.out.println(address.getHostName());
			// ip주소
			System.out.println(address.getHostAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
