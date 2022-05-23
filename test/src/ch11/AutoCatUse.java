package ch11;

public class AutoCatUse {
	public static void main(String[] args) {
		// 좌:부모, 우:자식
		OperateCar obj = new AutoCar();
		obj.start();
		obj.setSpeed(90);
		obj.turn(15);
		obj.stop();
	}

}
