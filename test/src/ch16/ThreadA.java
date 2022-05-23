package ch16;

public class ThreadA {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();
		
		synchronized (b) {
			try {
				System.out.println("b가 완료될때까지 기다립니다.");
				// main 스레드가 ThreadB에게 자신은 wait(일시정지)하겠다고 알림
				// wait()는 잠금(모니터링 락)을 풀고, 다른 스레드에서 notify(All)을
				// 호출해주기를 기다린다. notify가 도착하면 다시 잠금 시도를 하여 잠기면
				// 실행을 이어나간다.
				b.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Total is : "+b.total);
		}
	}

}

class ThreadB extends Thread {
	int total;
	
	@Override
	public void run() {
		synchronized (this) {
			for (int i=0; i<5; i++) {
				System.out.println(i+"를 더합니다.");
				total += i;
				try {
					Thread.sleep(500);					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			// wait하고 있는 스레드를 깨움
			notify();
		}
	}
}
