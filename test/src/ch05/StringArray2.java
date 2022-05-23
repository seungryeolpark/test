package ch05;

public class StringArray2 {
	public static void main(String[] args) {
		String[] str = {"Java", "DB", "JSP", "Spring"};
		for (int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
		for (String s : str) {
			System.out.println(s);
		}
	}
}
