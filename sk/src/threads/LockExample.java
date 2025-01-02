package threads;

// Synchronized block Example 
public class LockExample {
	private int count = 0;
	private final Object lock = new Object(); // Explicit lock object

	// Only this block is synchronized, not the entire method
	public void increment() {
		synchronized (lock) {
			count++; // Thread-safe access to count
		}
	}

	public int getCount() {
		synchronized (lock) {
			return count;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		LockExample name = new LockExample();
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				name.increment();
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 120; i++) {
				name.increment();
			}
		});

		t1.start();
		t2.start();
		/*
		 * This join methods are for completing the total execution of thread-0,thread-1
		 * after that main thread prints the count
		 */
		t1.join();
		t2.join();
		
		/*
		 * Main thread job
		 */
		System.out.println(name.getCount());
	}
}
