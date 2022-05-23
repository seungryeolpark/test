package ch11;

public class Rectangle extends Shape {

	// 반드시 추상클래스를 상속받으면 추상메소드를 구현해야 한다.
	@Override
	public void draw() {
		System.out.println("사각형 그리기 시작 x 좌표값 : "+x);
		System.out.println("사각형 그리기 시작 y 좌표값 : "+y);
		
	}

}
