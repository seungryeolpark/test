package ch13;

public class ObjCast {
	public static void main(String[] args) {
		int a = 10;
		// 부모 : 자식
		Object obj = 20;
		// 객체는 객체형끼리 형변환 해주는게 좋다.
		a = (Integer) obj;
//		a = (int) obj;
		System.out.println(a);
		// Auto Boxing
		// 사실은 각 데이터가 Object 객체(Integer, Double, Boolean 등..)가 되어버린다.
		// 그래서 메모리 낭비가 심하다. 이렇게 쓰는 일이 없다.
		// 대신 컬렉션처리(ArrayList등)을 하면 단점을 보완할 수 있다.
		Object[] obj2 = {100, 100.5, true, "hello", 'A'};
		// 향상된 for문 for each문
		for (Object o : obj2) {
			// Auto UnBoxing
			System.out.println(o);
		}
	}

}
