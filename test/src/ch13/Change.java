package ch13;

// 값을 교환하는 예제
public class Change {
	public static void main(String[] args) {
		// 콜라 컵
		int a = 10;
		// 사이다 컵
		int b = 20;
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
	}
}
