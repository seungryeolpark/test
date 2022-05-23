package ch13;

public class Box {
	// 맴버변수
	private Object data;
	
	public void set(Object data) {
		this.data = data;
	}
	
	public Object get() {
		return data;
	}
	
	public static void main(String[] args) {
		Box b = new Box();
		// 문자열 처리가능 ~ 모든 타입 가능
		b.set("Hello World");
		// String = Object(조상객체)
		String s = (String) b.get();
		
		Box c = new Box();
		c.set(30);
		// Class 객체 = Object(조상객체)
		Integer i = (Integer) c.get();
		
		System.out.println(s);
		System.out.println(i);
	}

}
