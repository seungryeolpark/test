package ch02;

public class HelloExam {// 클래스의 이름은 반드시 대문자로 시작 (중요)

	// 메소드의 이름은 반드시 소문자로 시작 (중요)
	public static int sum(int n, int m) {
		return n + m;
	}
	
	public static void main(String[] args) {
		// 변수의 이름은 반드시 소문자로 시작 (중요)
		int i = 20;
		int s;
		char a;
		
		s = sum(i, 10);
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	}
}
