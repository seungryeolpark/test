package ch18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DateStream {
	public static void main(String[] args) {
		// 텍스트파일이 아닌 binary file(이진파일)로 저장
		try {
			// 좌변도 동일한 자료형으로 처리해야함
			DataOutputStream dataout = new DataOutputStream(
					new FileOutputStream("c:\\test\\test.dat"));
			// 숫자 형식의 자료를 파일에 저장
			dataout.writeInt(123);
			// 문자 형식의 자료를 파일에 저장
			dataout.writeChar('A');
			// 실수 형식의 자료를 파일에 저장
			dataout.writeDouble(3.5);
			// 스트림 닫기(파일이 완성됨)
			dataout.close();
			System.out.println("저장되었습니다.");
			
			// 이진파일 읽기 위한 객체
			DataInputStream datain = new DataInputStream(
					new FileInputStream("c:\\test\\test.dat"));
			// 이진파일로 저장된 데이터를 화면에 처리
			System.out.println(datain.readInt());
			System.out.println(datain.readChar());
			System.out.println(datain.readDouble());
			datain.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
