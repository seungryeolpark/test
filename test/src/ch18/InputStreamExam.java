package ch18;

import java.io.IOException;

// 스트림 : 데이터의 논리적인 통로
// 1byte단위로 처리
// 프로그램 기준
// InputStream(입력스트림)
// OutputStream(출력스트림)

public class InputStreamExam {
	public static void main(String[] args) {
		int var = 0;
		// 입출력 프로그램은 try~catch문 안에서 필수 작성, (네트워크, DB..)
		try {
			System.out.println("내용을 입력하세요 : ");
			// 키보드로부터 1byte를 읽음, 따라서 한글(2byte)처리가 안됨
			var = System.in.read(); 
			// 엔터키를 입력할때까지 반복
			while( var != 13) {
				System.out.println(var+"==>"+(char) var);
				// 모든문자에는 고유한 숫자코드가 있다. 
				// int형 var를 문자형(char)로 형변환해서 출력
				var = System.in.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
