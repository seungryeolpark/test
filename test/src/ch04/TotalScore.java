package ch04;

import java.util.Scanner;

public class TotalScore {
	public static void main(String[] args) {
		int kor;
		int eng;
		int mat;
		int tot;
		double score;
		String grade;
		String output = "";
		
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<3; i++) {		
			System.out.print("국어 : ");
			kor = sc.nextInt();
			System.out.print("영어 : ");
			eng = sc.nextInt();
			System.out.print("수학 : ");
			mat = sc.nextInt();
			System.out.println();
			tot = kor+eng+mat;
			score = tot/3.0;
			
			if (score >= 85) {
				grade = "수";
			} else if (score >= 75) {
				grade = "우";
			} else if (score >= 65) {
				grade = "미";
			} else if (score >= 55) {
				grade = "양";
			} else {
				grade = "가";
			}
			
			output += String.format("%d\t%d\t%d\t%d\t%.1f\t%s\n",
					kor, eng, mat, tot, score, grade);
		}
		sc.close();
		
		System.out.println("=============================================");
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("---------------------------------------------");
		System.out.print(output);
		System.out.println("=============================================");
	}
}
