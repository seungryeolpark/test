package ch02;

import java.util.Scanner;
// ctrl + shift + o 를 누르면 import ....

public class ScannerEx {
	// 키보드로부터의 사용자 입력 프로그램
	public static void main(String[] args) {
		// 스캐너 객체 : 키보드로부터 값을 입력 받게 하는 객체
		Scanner in = new Scanner(System.in);
		
		// 안내문구
		System.out.println("첫번째 정수값");
		int x = in.nextInt(); // 정수값을 입력받도록하는 메소드 nextInt()
		
		System.out.println("두번째 정수값?");
		int y = in.nextInt();
		
		System.out.printf("%d * %d은 %d입니다.\n", x, y, x * y);
		in.close();
	}
}
