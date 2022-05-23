package ch13;

// <T>는 타입매개변수가 됨.

public class Box2<T> {
	private T data;
	
	public void set(T data) {
		this.data = data;
	}
	
	public T get() {
		return data;
	}
	
	public static void main(String[] args) {
		// 타입매개변수에 대입하게될 타입을 지정
		Box2<String> b = new Box2<String>();
		b.set("Hello ~~");
		String s = b.get();
		
		Box2<Integer> c = new Box2<Integer>();
		c.set(10);
		Integer i = c.get();
		
		System.out.println(s);
		System.out.println(i);
	}

}
