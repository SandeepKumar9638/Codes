package threads;

// Example of interrupted method  when it gone waste and it also wait the thread to enter into sleep or wait.
public class InterruptExample2 extends Thread {
	public void run()  {
		for(int i=0;i<100;i++){
			System.out.println("not slleping");	
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		
		InterruptExample2 name = new InterruptExample2();
		name.start();
		name.interrupt();
		name.join();
		System.out.println("main");
	}

}

/*
 * In above example thread-0 job is done and then interrupt is called as it is
 * waiting state to interrupt the thread
 */