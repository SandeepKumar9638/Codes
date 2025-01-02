package threads;

/*
 * Here lock of particular object 
 */
class Exmaple {
	public void primitive(String name) throws InterruptedException {
		/* Primitives are not accepted in synchronized objects
		 * int x=10; 
		 * synchronized (x) { 
		 * System.out.println("dsf"); }
		 */
		synchronized (name) { 
			
			for (int i = 0; i < 3; i++) {
				System.out.print("Wishing: ");
				Thread.sleep(1000);
				System.out.println(name);
			}
		}
	}
}

class MyThreadTwo extends Thread {
	Exmaple d;
	String name;
	


//	public MyThreadTwo(Exmaple d, String name) {   ///Aggregation
//		super();
//		this.d = d;
//		this.name = name;
//	}
	
	
	public MyThreadTwo(String name) {
        super();
        // MyThreadTwo creates its own Example instance  ///Composition
        this.d = new Exmaple();
        this.name = name;
    }
	
	
	public void run() {
		try {
			d.primitive(name);
			
		} catch (InterruptedException e) {
		}

	}
}

public class SynchronizedBlock2 {

	public static void main(String[] args) {

		//Exmaple name = new Exmaple();
		MyThreadTwo t1 = new MyThreadTwo("Sandeep");
		t1.start();
	}

}






