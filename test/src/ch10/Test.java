package ch10;

public class Test {
	static int a; // static member 변수
	int b; // non-static member 변수
	// non-static member 메소드
	void print() {
		System.out.println(a); // non-static 맴버 안에서는 static 멤버를 얼마든 사용가능하다.
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		
		Test t = new Test();
		System.out.println(t.b); // new를 해야만 non-static 멤버를 쓸 수 있음.
		t = null; // null 하면 참조변수는 주소를 잃고 메모리에서 떠돌아 다님
		System.out.println(t);
	}
}
