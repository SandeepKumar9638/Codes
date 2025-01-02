package threads;

class Shared {
	public boolean isNums = true;

	public synchronized void isChar(Character string) throws InterruptedException {
		while (!isNums) {
			wait();
		}
		System.out.println(string);
		isNums = false;
		notify();
	}

	public synchronized void isnum(int num) throws InterruptedException {
		while (isNums) {
			wait();
		}
		System.out.println(num);
		isNums = true;
		notify();
	}
}

class Thread1 extends Thread {
	private final Shared shared;

	public Thread1(Shared shared) {
		this.shared = shared;
	}

	public void run() {
		for (int i = 1; i < 27; i++) {
			try {
				shared.isnum(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread {
	Shared shared;

	public Thread2(Shared shared) {
		this.shared = shared;
	}

	public void run() {
		for (char i = 'A'; i <= 'Z'; i++) {
			try {
				shared.isChar(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Problem1 {

	public static void main(String[] args) throws InterruptedException {

		Shared shared = new Shared();
		Thread1 t1 = new Thread1(shared);
		Thread2 t2 = new Thread2(shared);

		t2.start();
		t1.start();

		t2.join();
		t1.join();

	}
}