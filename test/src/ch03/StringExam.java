package ch03;

public class StringExam {
	public static void main(String[] args) {
		String str = "Hello" + "java"; // 문자열을 연결하는 연결연산자
		System.out.println(str);
		
		// 숫자 + 문자열 => 문자열
		str = 123 + "C";
		System.out.println(str);
	}
}
