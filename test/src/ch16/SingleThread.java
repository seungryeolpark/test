package ch16;

// Single Thread : 작업단위가 1개 (main 스레드만 존재)
// 순차적으로 처리됨

public class SingleThread {
	void print() {
		System.out.println(Thread.currentThread().getName());
	}

}
