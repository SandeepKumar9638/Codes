package threads;
// Example of sleep method
public class SleepExample extends Thread {
	public void run() {

	}
	public static void main(String[] args) throws InterruptedException {

	//	SleepExample n = new SleepExample();
		for (int i = 0; i < 6; i++) {
			System.out.println(i);
			Thread.sleep(20000);
		}
	}
}
