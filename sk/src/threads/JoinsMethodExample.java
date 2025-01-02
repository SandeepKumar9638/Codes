package threads;

// In this example  joins() called thread waits for the other thread  to complete its execution
public class JoinsMethodExample extends Thread {
	public void run() {
		for(int i=0;i<6;i++) {
			System.out.println("Thread1");
		try {
			Thread.sleep(3);
		}catch (Exception e) {
		}		
		}
		/*
		 * setting a name to the thread
		 */
		Thread.currentThread().setName("child");
		/*
		 * checking the name of a thread
		 */
		System.out.println(Thread.currentThread().getName());
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		JoinsMethodExample name = new JoinsMethodExample();
	
	name.start();
	name.join();
	name.join(100);
	name.join(10000, 2);
	for(int i=0;i<8;i++) {
		System.out.println("THread2");
	}
	System.out.println(Thread.currentThread().getName());
		
	}
}
/*
 * We have 3 constructors for join() mentioned with different parameters 
 */
