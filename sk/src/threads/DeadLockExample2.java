package threads;

/*
 * Example for dead lock where thread is waiting for the lock's.
 * StackOverFlow error can be seen as the objects created of instance classes can cause out of memory
 * Circular References can be caused.
 */
class A {
//	B b= new B();
	public synchronized void d1(B b) throws InterruptedException {
		System.out.println("T-0 statrs execution ob B");

		Thread.sleep(5000);
		System.out.println("T-0 calling last() in B");
		b.last();
	}

	public synchronized void last() {
		System.out.println("This is A's last()");
	}
}

class B {
//	A a =new A();
	public synchronized void d2(A a) throws InterruptedException {
		System.out.println("T-1 statrs execution ob A");
		Thread.sleep(6000);
		System.out.println("T-1 calling last() in A");
		a.last();
	}

	public synchronized void last() {
		System.out.println("This is B's last()");
	}
}

public class DeadLockExample2 extends Thread {
	A a = new A();
	B b = new B();

	public void m() throws InterruptedException {
		this.start();//main thread job
		a.d1(b);
	}

	public void run() {
		try {
			b.d2(a);//child thread job
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		DeadLockExample2 deadlock = new DeadLockExample2();
		/* accessing the instance methods
		 * MainThread job 
		 */
		deadlock.m(); 

	}

}
