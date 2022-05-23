package ch13;

import java.util.Random;

public class Rand {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextDouble());
		// 임의의 정수
		System.out.println(r.nextInt());
		// 0~99
		System.out.println(r.nextInt(100));
		// 100~200
		System.out.println(r.nextInt(101)+100);
		// 0.0~1.0 미만 실수
		System.out.println(Math.random());
		
		int num = (int) (Math.random()*100);
		System.out.println(num);
	}

}
