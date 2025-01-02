package threads;

// starting a thread by runnable
public class StratingAThreadByRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println("child");
		}

	}

	public static void main(String[] args) {
		StratingAThreadByRunnable name = new StratingAThreadByRunnable();
		Thread na = new Thread(name);
		Thread na1 = new Thread();

		na.start();
		/*
		 * Below are the example's are for how thread runs.
		 */
		// na.run();
		na1.start();
		// na1.run();
		// name.run();
		na1.getName();
		for (int i = 0; i < 2; i++) {
			System.out.println("main");
		}

	}
}
