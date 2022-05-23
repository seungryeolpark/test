package ch13;

public class StrBuilder {
	public static void main(String[] args) {
		// String 불변(immutable)
		// StringBuilder 기변(mutable)
		// StringBuffer: 초기버전, StringBuilder: 최신버전
		StringBuilder sb1 = new StringBuilder();
		// append()는 문자열 내용 추가, 메모리 절약
		sb1.append("java");
		System.out.println(sb1.toString());
		sb1.append(" programming");
		System.out.println(sb1);
		
		// 0~3 인덱스 내용을 변경(java -> jsp)
		// 참고로 replace() 메소드는 주로 String객체의 replace()를 많이 쓰는 편이다.
		sb1.replace(0, 4, "jsp");
		System.out.println(sb1);
		// 인덱스 3부터 끝까지
		String str1 = sb1.substring(3);
		System.out.println(sb1);
		System.out.println(str1);
		// String str3 = sb1만 하면 error
		// StringBuilder를 String으로 바꿀 때는 toString()을 사용
		String str2 = sb1.toString();
		System.out.println("StringBuilder(str1) -> String(str3)"
				+ "에 저장 : "+str2);
		// String을 StringBuilder에 저장(초기화)할 때
		sb1 = new StringBuilder(str2);
		System.out.println("String(str2) -> StringBuilder(sb1)에 저장 : "+sb1);
	}

}
