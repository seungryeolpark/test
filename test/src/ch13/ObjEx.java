package ch13;
// 모든 class 에 extends Object 가 숨겨져있다.
public class ObjEx extends Object {
	public static void main(String[] args) {
		ObjEx e1 = new ObjEx();
		System.out.println(e1.getClass());
		System.out.println(e1);
		System.out.println(e1.toString());
	}

}
