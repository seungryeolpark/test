package ch03;

public class CastEx {
	public static void main(String[] args) {
		// 자료형 변환
		float f = 1.6f;
		System.out.println(f);
		
		// int형인 100이라는 정수값을 float형인 f가 자동으로 100.0으로 만든다.
		// 이러한 변환을 자동형변환(확장형)이라고 한다.
		f = 100;
		System.out.println(f);
		
		// 큰 값에서 작은 값으로 변환은 개발자가 명시적으로 함
		f = 100.5f;
		int i = (int)f;
		System.out.println(i);
	}
}
