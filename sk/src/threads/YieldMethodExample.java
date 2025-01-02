package threads;

//yield method example

public class YieldMethodExample extends Thread {

	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println("child");
			Thread.yield(); // Yields till the other thread completes its execution
		}
	}

	public static void main(String[] args) {
		YieldMethodExample th = new YieldMethodExample();
		th.start();
		for (int i = 0; i < 9; i++) {
			System.out.println("parent");
		}
	}
}
