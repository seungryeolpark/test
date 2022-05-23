package ch16;

public class ThreadJoin extends Thread {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+
				"스레드가 시작되었습니다.");
		ThreadJoin e = new ThreadJoin();
		e.setName("thread1");
		e.start();
		
		try {
			// 새로운 작업을 요청하면 기다렸다가 가디실행 - 싱글스데르처럼
			e.join();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+
				"스레드가 종료되었습니다.");
		
		
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+
				"스레드가 시작되었습니다.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println(Thread.currentThread().getName()+
				"스레드가 종료되었습니다.");
	}

}
