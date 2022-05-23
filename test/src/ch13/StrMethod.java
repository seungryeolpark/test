package ch13;

public class StrMethod {
	public static void main(String[] args) {
		String str1 = "java";
		// str1 = str1 + " programming", 문자열 연결하지만
		// 실제론 새로운 문자열을 만들고 str1은 새로운 문자열의 주소값을 가리키게됨.
		str1 += " programming"; 
		System.out.println(str1);
		// 문자열의 길이
		System.out.println(str1.length());
		// concat()으로 문자열을 연결
		String str2 = str1.concat(" programming");
		System.out.println(str2);
		System.out.println(str1);
		// charAt(n) n번째 문자 리턴
		System.out.println(str1.charAt(2));
		// "program"의 시작문자열의 인덱스값을 리턴
		System.out.println(str2.indexOf("program"));
		// 내용이 없으면 -1을 리턴한다.
		System.out.println(str2.indexOf("z"));
		// substring(start, end-1) => (0~3)
		System.out.println(str2.substring(0, 4));
		// substring(n~)
		System.out.println(str2.substring(5));
		// 문자열.replace(old, new)
		System.out.println(str2.replace("java", "jsp"));
		
		String str3 = "1023810283012";
		System.out.println(str3.substring(5, 9));
		System.out.println(str3.replace(str3.substring(5, 9), "****"));
	}

}
