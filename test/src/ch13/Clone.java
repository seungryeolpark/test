package ch13;

// 인스턴스(객체)를 복제하려면 Cloneable 인터페이스를 implements 해야 한다.
public class Clone implements Cloneable {
	int num = 10;
	void print() {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Clone t1 = new Clone();
		Clone t2 = null;
		// 예외가 발생할 가능성의 코드
		try {
			// 인스턴스를 복제함, clone()은 Object의 메소드
			// 좌:Clone(자식), 우:Object(부모)를 맞추기 위해 형변환해야 한다.
			t2 = (Clone) t1.clone();
		} catch (CloneNotSupportedException e) {
			// 개발자를 위한 디버깅 정보 제공
			e.printStackTrace();
		}
		System.out.println(t1);
		System.out.println(t2);
		t1.print();
		t2.print();
	}

}
