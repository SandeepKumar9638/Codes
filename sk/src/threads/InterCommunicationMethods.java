package threads;


public class InterCommunicationMethods {

	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().wait();
		Thread.currentThread().notify();
		Thread.currentThread().notifyAll();

	}

}
