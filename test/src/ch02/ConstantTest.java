package ch02;

public class ConstantTest {
	public static void main(String[] args) {
		// 상수는 final을 붙여서 상수처리한다.
		final double KM_PER_MILE = 1.609344;
		double km;
		double mile = 60.0;
		
		km = KM_PER_MILE * mile;
		
		System.out.println("60마일은 " + km + "킬로미터입니다.");
		System.out.println("60마일은 " + km + "킬로미터입니다.");
	}
}
