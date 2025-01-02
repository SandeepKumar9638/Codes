package threads;

class ThreadA extends Thread{
	int total=0;
	public void run() {
	synchronized (this) {
		System.out.println("Child thread stared working");
		for(int i=1;i<100;i++) {
			total+=i;
		}
		//System.out.println(total);
		System.out.println("child thread notifyes the main thread");
		this.notify();
	}
	}
}
public class InterCommunicationMethods1 {

	public static void main(String[] args) throws InterruptedException {
	ThreadA t= new ThreadA();
	t.start();
	Thread.sleep(1000);
	synchronized (t) {
		System.out.println("Main thread calling wait method");
		t.wait(10000);
	}
	System.out.println("execution completed");
System.out.println(t.total);
	}

}
