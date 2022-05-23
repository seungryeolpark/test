package ch13;

import java.util.StringTokenizer;

public class StrToken {
	public static void main(String[] args) {
		// 콤마, tab, /를 주어서 데이터를 구분
		String str = "kim,20,180,55,시온,학생";
		String[] items = str.split(",");
		for (String s : items) {
			System.out.println(s);
		}
		
		StringTokenizer st = new StringTokenizer(str, ",");
		// 토큰의 갯수
		int cnt = st.countTokens();
		System.out.println("토큰의 갯수:"+cnt);
		// 다음 요소의 내용이 있으면
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}

}
