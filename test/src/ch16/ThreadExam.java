package ch16;

// 멀티스레드 : 작업단위가 2개 이상
// 구현방법 1: Thread 상속
// 구현방법 2: Runnable을 구현
public class ThreadExam extends Thread {
	public ThreadExam(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for (int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadExam te1 = new ThreadExam("thread1");
		ThreadExam te2 = new ThreadExam("thread2");
		ThreadExam te3 = new ThreadExam("thread3");
		// run() 메소드를 직접쓰면 안된다. start() 메소드를 반드시 써야 한다.
//		te1.run();
		// 스레드객체.start() ==> run()이 자동 호출됨
		te1.start();
		te2.start();
		te3.start();
	}

}
