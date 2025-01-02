package threads;

//starting a thread with another thread class object

public class StratingAThread2 extends Thread {
	public void run() {
		System.out.println("t1");
	}

	public static void main(String[] args) {
		StratingAThread2 name = new StratingAThread2();
		Thread n= new Thread(name);
		n.start();
	}

}
