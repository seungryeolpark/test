package ch11;

public class Coin1Demo implements Coin {
	// 인터페이스에서 상수만을 사용했을때 implements 를 사용안해도 된다.
	public static void main(String[] args) {
		// 인터페이스의 상수는 static 영역
		System.out.println("Dime은 "+Coin.DIME+"센트 입니다.");
	}

}
