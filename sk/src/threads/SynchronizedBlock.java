package threads;
/*
 *  synchronized block for current object
 *  
 */
class AccesingClass {
	int count;

	public   void increase() {
		synchronized (this) {
//			count++;
			System.out.println("Hello" );
		}
	}
}

public class SynchronizedBlock {

	public static void main(String[] args) throws InterruptedException {

		AccesingClass name = new AccesingClass();
		//name.increase();
		Thread t = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				name.increase();
			}
		});
		
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				name.increase();
			}
		});

		t.start();
		t1.start();
		t.join();
		
		
		t1.join();
		System.out.println(name.count);

	}

}
