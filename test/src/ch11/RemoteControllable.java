package ch11;

public interface RemoteControllable extends Controllable {
	// 인터페이스 끼리는 extends로 상속
	void remoteOn();
	void remoteOff();
}
