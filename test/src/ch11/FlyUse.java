package ch11;

public class FlyUse {
	public static void main(String[] args) {
		// 첫번째 : 객체 생성방법
		Bird bird = new Bird();
		System.out.println(bird);
		bird.takeOff();
		bird.fly();
		bird.land();
		
		Airplane air = new Airplane();
		System.out.println(air);
		air.takeOff();
		air.fly();
		air.land();
		System.out.println("=======================");
		
		// 두번째 : 다형성기법
		// 좌변:부모, 우변:자식 => 다형성
		Flyer f = new Bird();
		System.out.println(f);
		f.takeOff();
		f.fly();
		f.land();
		
		f = new Airplane();
		System.out.println(f);
		f.takeOff();
		f.fly();
		f.land();
	}

}
