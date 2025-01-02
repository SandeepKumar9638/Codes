package threads;

//example for setting thread name and getting the thread name

public class SetGetNameOfThread extends Thread {

	public static void main(String[] args) {

		SetGetNameOfThread name = new SetGetNameOfThread();
		System.out.println(Thread.currentThread().getName());
		System.out.println(name.getName());
		Thread.currentThread().setName("sandeep");
		System.out.println(Thread.currentThread().getName());

		System.out.println(name.MAX_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(name.getPriority());
		System.out.println(name.getPriority());
		/* IllegalArgumentException */
		name.setPriority(17);

	}

}
