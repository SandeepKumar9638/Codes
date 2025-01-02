package threads;

// Instantiating thread by thread class
class StratingAThread extends Thread {

	public void run() {
		for (int i = 0; i < 3; i++) {

			System.out.println("thread");

		}
	}

	public static void main(String[] args) {
		StratingAThread name = new StratingAThread();
		name.start();

		for (int i = 0; i < 6; i++) {
			System.out.println("main thread");
		}

	}

}
