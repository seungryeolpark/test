package ch01;

public class AreaTest {
	public static void main(String[] args) {
		double radius = 5.0;
		double area = radius * radius * 3.14;
		System.out.println("==============================");
		System.out.printf("원의 면적은 %06.1f\n", area);
		System.out.println("==============================");
	}
}
