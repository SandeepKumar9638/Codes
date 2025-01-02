package threads;

/*
 * In this the daemon thread expires after the completion of non-daemon threads
 */
class MyThread3 extends Thread {

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Child thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class DeamonExample1 {
	public static void main(String[] args) {
		MyThread3 m3 = new MyThread3();
		m3.setDaemon(true);
		System.out.println(m3.isDaemon());
		m3.start();
		for (int i = 0; i < 3; i++) {
			System.out.println("parent thread");
		}
	}
}
