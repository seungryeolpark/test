package ch13;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		// 올림
		System.out.println(Math.ceil(10.1));
		// 반올림
		System.out.println(Math.round(10.5));
		// 버림
		System.out.println(Math.floor(10.9));
		
		Random r = new Random();
		System.out.println("정수 : "+r.nextInt(100));
		System.out.println("실수 : "+r.nextDouble());
		
		int a = 10;
		// 옛 jdk 버전에서는 에러, 내부적으로 intValue()작동
		Integer b = 20;
		Integer c = new Integer(30);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c.intValue());
	}
}
