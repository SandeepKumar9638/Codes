package threads;

// Here interrupt method is verified and my thoughts are placed
public class InterruptExample  extends Thread{
	public void run() {
		
		try {
			
			for (int i=0;i<8;i++) {
			System.out.println("slleping");
		
				Thread.sleep(1000);
			} }catch (InterruptedException e) {
				System.out.println("interupted");
				
			//e.printStackTrace();
			}
		
	}
	public static void main(String[] args) throws InterruptedException {
		InterruptExample name = new InterruptExample();
		//InterruptExample.currentThread().setPriority(9);
		name.setPriority(8);
		System.out.println(name.getPriority());
		
		
		name.start();
	// This method is for interrupting the thread from sleep	
	name.interrupt();
	
	// Here main thread executes after the completion of thread-0
	name.join();
	
	System.out.println("main thread done");
	}
}
