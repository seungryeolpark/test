package ch03;

public class SignImcrementEx {
	public static void main(String[] args) {
		int plushOne = 1;
		int minusOne = -1;
		System.out.println("plusOne은 " + plushOne + "입니다.");
		System.out.println("minusOne은 " + minusOne + "입니다.");
		
		int x = 1, y = 1;
		System.out.println("x = " + x + ", ++x = " + ++x);
		System.out.println("y = " + y + ", y++ = " + y++);
		System.out.println("x = " + x + ", y = " + y);
	}
}
