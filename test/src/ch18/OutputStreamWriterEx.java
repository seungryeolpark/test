package ch18;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class OutputStreamWriterEx {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		OutputStream os = ps;
		// OutputStreamWriter(OutputStream)
		// 2byte처리(한글가능)
		OutputStreamWriter osw = new OutputStreamWriter(os);
		
		try {
			// 가
			osw.write(44032);
			osw.write("나다라");
			osw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
