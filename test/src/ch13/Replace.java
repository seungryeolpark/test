package ch13;

public class Replace {
	public static void main(String[] args) {
		String a = "java program";
		System.out.println(a.replace("a", "A"));
		// String의 불변성으로 인해 실제 값은 안바뀐다.
		System.out.println(a);
		//다른 번지수에서 생성
		a = a.replace("a", "A");
		System.out.println(a);
	}

}
