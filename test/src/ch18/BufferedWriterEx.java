package ch18;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class BufferedWriterEx {
	public static void main(String[] args) {
//		PrintStream ps = System.out;
//		OutputStream os = ps;
//		OutputStreamWriter osw = new OutputStreamWriter(os);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			bw.write("환영합니다.\n");
			bw.write("Java");
			// 개행처리를 해주는 메소드
			bw.newLine();
			bw.write("World!");
			bw.flush();
			// 스캐너처럼 객체를 종료하면 close()하는게 좋다.
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
