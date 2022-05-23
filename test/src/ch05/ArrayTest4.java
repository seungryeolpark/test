package ch05;

import java.util.Scanner;

public class ArrayTest4 {
	public static void main(String[] args) {
		int total = 0;
		int size;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하시오 : ");
		size = sc.nextInt();
		int[] scores = new int[size]; // 변수로 배열의 크기를 지정할 수 있다.
		for (int i=0; i<scores.length; i++) {
			System.out.print("성적을 입력하세요 : ");
			scores[i] = sc.nextInt();
		}
		sc.close();
		
		for (int i=0; i<scores.length; i++) {
			total += scores[i];
		}
		System.out.println("평균 성적은 "+(total/scores.length+"입니다."));
	}

}
