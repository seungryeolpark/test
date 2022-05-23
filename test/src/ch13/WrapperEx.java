package ch13;

// Wrapper class : 기본자료형을 포함하는 클래스
// 기본 자료형에 대한 다양한 method를 지원

public class WrapperEx {
	public static void main(String[] args) {
		Integer i1 = 10;
		Integer i2 = new Integer(20);
		
		int num1 = i1.intValue();
		// auto unboxing(객체로 포장된 value를 꺼내는 작업 (intValue()) )
		int num2 = i2; 
		int sum = num1+num2;
		
		System.out.println(sum);
		// 2진수
		System.out.println(Integer.toBinaryString(sum));
		// 8진수
		System.out.println(Integer.toOctalString(sum));
		// 16진수
		System.out.println(Integer.toHexString(sum));
	}
	
}
