package threads;


/*
 * In this example we can see thread behavior irregular out-puts due to locks.
 * with locks we can observe the irregurality of the outputs.
 */
 class Display{
	 public static synchronized void wish(String name) throws InterruptedException {
		 for(int i=0;i<2;i++) {
			 System.out.print("Hi : ");
			 Thread.sleep(1);
			 System.out.println(name);
		 }
	 }
	 
	 public  synchronized void evening(String name) throws InterruptedException {
		 for(int i=0;i<2;i++) {
			 System.out.print("Good Evening:");
			 Thread.sleep(1);
			 System.out.println(name);
		 }
	 }
 }
 class MyThread extends Thread{
	 
	 private Display d;
	 private String name;
	public MyThread(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		
			try {
				d.wish(name);
				d.evening(name);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	 
 

public class SynchronizedExample1 {

	public static void main(String[] args) {
		Display d = new Display();
		MyThread t = new MyThread(d,"Sandeep");
		MyThread t1 = new MyThread(d,"Keer");
		t.start();
		t1.start();

	}

}
