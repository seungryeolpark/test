package ch18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamEx2 {
	public static void main(String[] args) {
		// 1byte(8비트)처리 스트림
		InputStream is = System.in; 
		// 2byte(16비트)처리 스트림
		InputStreamReader isr = new InputStreamReader(is);
		// new InputStreamReader(InputStream)구조로 코딩
		try {
			System.out.println("한글자를 입력하세요 : ");
			int code = isr.read();
			System.out.println("code : "+code);
			// 코드값에 대응되는 문자
			char ch = (char)code;
			System.out.println("char : "+ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
