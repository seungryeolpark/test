package ch02;

public class TypeMismatch {
	public static void main(String[] args) {
		byte n;
		n = 127; // byte 타입의 값은 -128~127 까지만 값처리가 된다.
		System.out.println(n);
	}
}
