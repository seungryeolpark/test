package ch10;

// 부모 클래스
class K {
	int a = 10;
	public void print() {
		System.out.println(a);
	}
}
// 자식 클래스
class V extends K {
	int a = 20;
	@Override
	public void print() {
		System.out.println(a);
	}
}

public class Poly {
	public static void main(String[] args) {
		// 일반적인 형식
		V a = new V();
		a.print();
		K b = new K();
		b.print();
		// 좌:부, 우:자 => 다형성
		K c = new V(); 
		c.print();
	}

}
