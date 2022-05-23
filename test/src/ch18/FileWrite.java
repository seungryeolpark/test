package ch18;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileWrite {
	public static void main(String[] args) {
		// 프로그램 ==> 파일(출력스트림을 씀)
		OutputStream os = null;
		try {
			os = new FileOutputStream("c:\\test\\aa.txt");
			System.out.println("입력하세요 : ");
			while (true) {
				// 1byte 읽음
				int ch = System.in.read();
				// 엔터키(13)을 만나면 종료
				if (ch == 13) break;
				// 파일에 입력된 값이 저장
				os.write(ch);
			}
			System.out.println("저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
