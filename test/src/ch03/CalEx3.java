package ch03;

import java.util.Scanner;

public class CalEx3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int a = in.nextInt();
		System.out.println("정수를 입력하세요 : ");
		int b = in.nextInt();
		
		System.out.printf("a+b=%d\n", a+b);
		System.out.printf("a-b=%d\n", a-b);
		System.out.printf("a*b=%d\n", a*b);
		System.out.printf("a/b=%.2f\n", (double) a/b);
		System.out.printf("a%%b=%d\n", a%b);
	}
}
