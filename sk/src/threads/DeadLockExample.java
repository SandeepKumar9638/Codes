package threads;


//In this example main thread object is called on child thread.

//Here is a deadlock situation as both threads are calling join methods

public class DeadLockExample extends Thread{

	//static Thread thread;
	public void run() {
	//thread.join();
	for(int i=0;i<6;i++) {
		System.out.println("chilsparent");
	}
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		DeadLockExample name = new DeadLockExample();
		name.start();
		
	//	DeadLockExample.thread= Thread.currentThread();
		name.join();
	 /* here the main thread itself is waiting for its completion its a kind of deadlock*/
		
		//System.out.println(thread);
		Thread.currentThread().join();
		for(int i=0;i<6;i++) {
			System.out.println("mainthread");
			//Thread.sleep(1000);
		}//thread.join();
		
	}
}
