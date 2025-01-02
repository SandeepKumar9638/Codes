package threads;

/*.
 * A single thread acquires multiple locks simultaneously
 */
class Y{
	
}
class Z{
	
}
class X implements Runnable{
	public  void m1() {
		Y y= new Y();
		synchronized (y) {
			System.out.println("Y");
		}
		Z z= new Z();
		synchronized (z) {
			System.out.println("Z");
			
		}
	}
	public void run() {
		System.out.println("run");
	}
}
public class MultipleLocks {

	public static void main(String[] args) {
		X x = new X();
		Thread t = new Thread(x);
		x.m1();
		t.start();
	}

}
