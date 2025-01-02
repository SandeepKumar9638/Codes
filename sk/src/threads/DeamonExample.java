package threads;

class DaemonThread extends Thread {
	public void run() {
		System.out.println("Daemon thread is running.");
	}
}

public class DeamonExample {
	public static void main(String[] args) {

		System.out.println(Thread.currentThread().isDaemon());

		DaemonThread t = new DaemonThread();

		System.out.println(t.currentThread().isDaemon());

		t.setDaemon(true);

		System.out.println(t.isDaemon());

		t.start();

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Main thread is ending.");
	}
}
