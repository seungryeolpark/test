package ch18;

import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		// 콘솔창에 별도의 스트림값을 출력하기 위해
		PrintStream ps = System.out;
		// PrintStream 객체를 부모타입인 OutputStream으로 받아 처리한다.
		// OutputStream도 1byte 처리 스트림이다.
		OutputStream os = ps;
		try {
			os.write(97);
			os.write(98);
			os.write(99);
			// flush() 메소드를 써야 출력까지 된다.
			os.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
