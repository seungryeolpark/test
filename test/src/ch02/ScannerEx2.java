package ch02;

import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		String name = sc.next(); // 문자를 입력받게 하는 메소드 next()
		
		System.out.println("나이를 입력하세요 : ");
		// shot 타입으로 입력받게 하는 메소드 nextShort()
		short age = sc.nextShort(); 
		
		System.out.println("현재 가진 현금의 금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		System.out.println("집에서 직장까지의 거리를 m단위로 입력하세요 : ");
		long distance = sc.nextLong();
		
		System.out.println("자신의 키(신장)를 입력하세요 : ");
		float height = sc.nextFloat();
		
		System.out.println("자신의 몸무게를 입력하세요 : ");
		double weight = sc.nextDouble();
		
		System.out.println("===========================");
		System.out.println("당신의 이름은 " + name + "입니다.");
		System.out.println("당신의 나이는 " + age + "입니다.");
		System.out.println("당신의 현재 금액은 " + money + "입니다.");
		System.out.println("당신의 출근거리는 " + distance + "입니다.");
		System.out.println("당신의 키는 " + height + "입니다.");
		System.out.println("당신의 몸무게는 " + weight + "입니다.");
		sc.close();
	}
}
