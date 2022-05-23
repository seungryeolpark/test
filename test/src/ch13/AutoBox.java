package ch13;

public class AutoBox {
	public static void main(String[] args) {
		int num1 = 10;
		int num2;
		// 객체 참조변수(주소값 저장), 아직은 선언만 했기에 i1의 값은 null
		Integer i1;
		// Auto Boxing(기본자료형을 객체로 박스 처리)
		Integer i2 = new Integer(20);
		i1 = num1;
		// Auto UnBoxing(객체 안에 들어있는 값을 풀어서 저장)
		num2 = i2;
		System.out.println(num1+","+i1);
		System.out.println(num2+","+i2);
	}

}
