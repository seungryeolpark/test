package ch03;

import java.util.Scanner;

// 성적계산 프로그램
// 국어, 영어, 수학 점수를 입력받아 총점, 평균 출력
public class Point {
	public static void main(String[] args) {
		// 변수 선언
		String name;
		int kor, eng, mat, tot;
		double avg;
		
		// 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		mat = sc.nextInt();
		sc.close();
		
		// 계산
		tot = kor + eng + mat;
		avg = tot / 3.0;
		
		// 출력
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.print(name + "\t" + kor + "\t" + eng + "\t");
		System.out.println(mat + "\t" + tot + "\t" + avg);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%5.1f", name, kor, eng, mat, tot, avg);
	}
}
