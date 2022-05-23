package ch06;

public class GuguEx {
	public static void main(String[] args) {
		gugu(2);
		System.out.println();
		guguAll();
	}
	
	public static void gugu(int n) {
		System.out.println("==첫번째 gugu메소드 활용==");
		for (int i=1; i<=9; i++) {
			System.out.println(n+"x"+i+" = "+(n*i));
		}
	}
	
	public static void guguAll() {
		System.out.println("==두번째 guguAll메소드 활용==");
		for (int i=2; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				System.out.println(i+"x"+j+" = "+(i*j));
			}
			System.out.println();
		}
	}

}
