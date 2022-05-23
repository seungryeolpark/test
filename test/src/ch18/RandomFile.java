package ch18;

import java.io.RandomAccessFile;

public class RandomFile {
	public static void main(String[] args) {
		String str = null;
		try {
			// 읽기쓰기  모드
			RandomAccessFile file = new RandomAccessFile("c:\\test\\rand.txt", "rw");
			// getFilePointer() : 파일포인터(파일을 어디까지 읽었는지 가리킴
			System.out.println(file.getFilePointer());
			// 8번째 인덱스부터
			file.seek(8);
			System.out.println(file.getFilePointer());
			file.write("HTML".getBytes());
			// 포인터의 위치를 옮기는 메소드
			// 문자길이(한글은 3바이트의 길이값을 가정)
			System.out.println(file.length());
			System.out.println(file.getFilePointer());
			while(file.getFilePointer() < file.length()) {
				str = file.readLine();
				// iso-8859-1, 8859_1(2byte) : 서유럽언어 인코딩 방식
				// ms949(2byte)
				// utf-8(3byte) : 초성(1byte), 중성(1byte), 종성(1byte)
				// new String(문자열, 캐릭터셋) : 인코딩식 변환
				str = new String(str.getBytes("utf-8"), "8859_1");
			}
			System.out.println(file.length());
			System.out.println(file.getFilePointer());
			// 파일 저장시점
			file.close();
			System.out.println("파일이 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
