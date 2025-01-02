package threads;

class Producer extends Thread{
	public void run() {
		synchronized (this) {
			String s=Thread.currentThread().getName();
			for(int i=0;i <=2;i++) {
				 System.out.println(i);
			}
			System.out.println(s);		
			this.notifyAll();
		}
	}
}

public class InterCommunicationMethods2 {
	public static void main(String[] args) throws InterruptedException {
		//	Producer p = new Producer(lock);
		Producer p1 = new Producer();
		Producer p2 = new Producer();
		Producer p3 = new Producer();
		Producer p4 = new Producer();
		Producer p5 = new Producer();
		Producer p6 = new Producer();

		//p.start();
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		p6.start();
		
		p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();
		
		
		synchronized (p1) {
			for(int i=0;i<6;i++) {
				p1.wait();
			}
		}
		

		/*
		 * synchronized (p) { p.wait(); } synchronized (p1) { p1.wait(); } synchronized
		 * (p2) { p2.wait(); } synchronized (p3) { p3.wait(); } synchronized (p4) {
		 * p4.wait(); } synchronized (p5) { p5.wait(); } synchronized (p6) { p6.wait();
		 * }
		 */

		System.out.println(Thread.currentThread().getName());
	}

}
