package threads;

// Priority example
public class PriorityExample extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {

			System.out.println("thread");

		}

	}

	public static void main(String[] args) throws InterruptedException {
		PriorityExample name = new PriorityExample();
		name.start();
		name.setPriority(9);
		name.join();
		System.out.println(name.getPriority());
		for (int i = 0; i < 3; i++) {

			System.out.println("mian");

		}

		/*
		 * Thread.currentThread().setPriority(9);
		 * System.out.println(Thread.currentThread().getPriority());
		 * System.out.println(name.currentThread().getPriority());
		 */

	}
}
