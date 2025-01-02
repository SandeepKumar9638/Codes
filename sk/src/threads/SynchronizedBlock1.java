package threads;

/*
 * class level lock for synchronized block.
 * Irregular o/p when we execute as different threads acting on two different objects 
 */
class DisplayOne {

	public void wish(String name) throws InterruptedException {
	synchronized (DisplayOne.class) { // class-level lock for block 
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Wishing: ");
			Thread.sleep(1000);
			System.out.println(name);
		}
	}
	}

	public  void evening(String name) throws InterruptedException {
		synchronized (this) {
			for (int i = 0; i < 3; i++) {
		
			System.out.print("Good evening:");
			Thread.sleep(1000);
			System.out.println(name);
		}
		}
	}
}

class MyThreadOne extends Thread {
	DisplayOne d;
	String name;

	public MyThreadOne(DisplayOne d, String name) {
		super();
		this.d = d;
		this.name = name;
	}

	public void run() {
		try {
			d.wish(name);
			d.evening(name);
		} catch (InterruptedException e) {
		}

	}
}

public class SynchronizedBlock1 {

	public static void main(String[] args) {
		DisplayOne d = new DisplayOne();
		DisplayOne d1 = new DisplayOne();
		MyThreadOne t1 = new MyThreadOne(d, "Sandeep");
		MyThreadOne t2 = new MyThreadOne(d, "Kumar");
		MyThreadOne t3 = new MyThreadOne(d1, "sai");
		MyThreadOne t4 = new MyThreadOne(d1, "sagar");
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}
