package ch10;

public class StaticVar {
	static int a = 10; // static member
	int b = 20; // non-static member
	public static void main(String[] args) {
		// static 멤버는 클래스이름.static 멤버로 접근해 사용가능하다.
		System.out.println(StaticVar.a);
		
		StaticVar s = new StaticVar();
		System.out.println(s.b);
	}

}
