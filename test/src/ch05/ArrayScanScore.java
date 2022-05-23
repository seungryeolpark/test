package ch05;

import java.util.Scanner;

public class ArrayScanScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("성적처리할 학생수를 입력하세요 : ");
		int size = sc.nextInt();
		int score[] = new int[size];
		int sum = 0;
		double avg = 0.0;
		
		for (int i=0; i<score.length; i++) {
			System.out.print("성적을 입력하세요 : ");
			score[i] = sc.nextInt();
		}
		
		for (int value : score) {
			sum += value;
		}
		avg = sum/(double)score.length;
		
		System.out.println("총점은 "+sum+"점 입니다.");
		System.out.println("평균은 "+String.format("%.1f", avg)+"점 입니다.");
		sc.close();
	}
}
