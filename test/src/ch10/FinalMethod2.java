package ch10;

class T {
	private int num = 10;
	public void print() {
		System.out.println(num);
	}
}

public class FinalMethod2 extends T {
	int num = 100;
	// 부모쪽 오버라이딩되는 메소드가 final일때 에러
	public void print() {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		FinalMethod2 f = new FinalMethod2();
		f.print();
	}

}
