package ch04;

public class Matrix2 {
	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				if (i==j) {
					System.out.printf("[%d,%d]", i, j);
				} else {
					// c는 단문자 출력, 5칸씩 빈문자 출력
					System.out.printf("%5c", ' ');
				} // if else
			} // inner
			System.out.println();
		} // outer
	}
}
