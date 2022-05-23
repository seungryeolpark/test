package ch16;

public class ATMsync {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mom = new Thread(atm, "mom");
		Thread son = new Thread(atm, "son");
		mom.start();
		son.start();
		
	}

}

class ATM implements Runnable {
	private long depositMoney = 10000;

	@Override
	public void run() {
		synchronized (this) {
			for (int i=0; i<10; i++) {
				// 일시정지상태에 있는 스레드를 깨움.
				// wait하고 있는 스레드(한개만)에 [notify신호]를 보낸다.
				// 여러 스레드가 wait하고 있으면 한개만 무작위로 깨운다.
				// wait을 하고 있는 스레드가 없는 경우 [notify신호]는 그냥 소멸한다.
				notify();
				
				// notifyAll() : wait를 하고 있는 모든 스레드를 깨운다.
				// 이 때 깨어나는 순서는 무작위다.
				try {
					// 현재 실행 스레드를 일시정지상태로 만들면서, 다른 스레드가 실행되도록 허용
					wait();
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				if (getDepositMoney() <= 0) break;
				withDraw(1000);
			}
		}
	}
	
	public long getDepositMoney() {
		return depositMoney;
	}
	
	public void withDraw(long howMuch) {
		if (getDepositMoney() > 0) {
			depositMoney -= howMuch;
			System.out.print(Thread.currentThread().getName()+", ");
			System.out.printf("잔액 : %,d 원 %n", getDepositMoney());
		} else {
			System.out.print(Thread.currentThread().getName()+", ");
			System.out.println("잔액이 부족합니다.");
		}
	}
}
