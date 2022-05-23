package ch13;

public class ToStr {
	public static void main(String[] args) {
		Object obj = new Object();
		// 좌:부모(첫조상) 우:자식 => 다형성
		// 참조변수에는 원래 주소값이 들어가지만 jdk1.5 부터는 value가
		// 들어갈 수 있도록 내부적(intValue()등 호출)하도록 했다.(Auto Boxing 처리)
		obj = new Integer(20);
		// Auto UnBoxing
		System.out.println(obj);
		obj = new Double(20.5);
		System.out.println(obj);
		obj = "hello";
		System.out.println(obj);
	}

}
