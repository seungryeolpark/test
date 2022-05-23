package ch05;

import java.util.Scanner;

public class SeqSearch {
	public static void main(String[] args) {
		int s[] = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int value;
		int index = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("(보기 : ");
		for (int i=0; i<s.length; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
		System.out.print("위 숫자 중 탐색할 값을 입력하시오 : ");
		value = sc.nextInt();
		sc.close();
		
		for (int i=0; i<s.length; i++) {
			if (s[i] == value) index = i;
		}
		if (index<s.length && index >= 0) { // true && true = true
			System.out.println(value+"값은 index "+index+"의 위치에 있습니다.");
		}
	}

}
