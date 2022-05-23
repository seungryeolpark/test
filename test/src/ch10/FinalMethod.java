package ch10;

class A2 {
	// 만약 부모 클래스에서 멤버 메소드중에 final이 붙으면 오버라이드가 안된다.
//	final void print() {
	// non-static
	void print() {
		System.out.println("a");
	}
}

class B2 extends A2 {
	// 메소드 오버라이딩
	void print() {
		super.print();
		System.out.println("b");
	}
}

public class FinalMethod {
	public static void main(String[] args) {
		B2 b = new B2();
		b.print();
	}

}
