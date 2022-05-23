package ch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {
	public static void main(String[] args) {
		// (OutputStream) 복사본 <== [프로그램] <== (InputStream) 원본
		String str = "";
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		String src_file = "c:\\test\\aa.txt";
		String copy_file = "c:\\test\\b.txt";
		
		try {
			reader = new BufferedReader(new FileReader(new File(src_file)));
			writer = new BufferedWriter(new FileWriter(new File(copy_file)));
			
			while (true) {
				// 한라인을 읽음 \r\n 라인의 끝을 인식
				str = reader.readLine();
				if (str == null) break;
				writer.write(str+"\r\n");
			}
			System.out.println("파일 복사가 완료됐습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 리소스를 개별적으로 닫아주는게 좋다.
				if (reader != null) reader.close();
				if (writer != null) writer.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
