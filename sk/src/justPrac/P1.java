package justPrac;

import java.util.Stack;

class Exam implements Runnable {
	public void run() {
		System.out.println("hi");
	}
}

public class P1 {

	public static void main(String[] args) {

		Exam ex = new Exam();
		Thread t = new Thread(ex);
		t.start();
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		stack.add(5);
		stack.push(8);
		System.out.println(stack);
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
		/*
		 * System.out.println(stack.peek()); System.out.println(stack.pop());
		 * System.out.println(stack); System.out.println(stack.isEmpty());
		 * System.out.println(stack.capacity()); System.out.println(stack.push(5));
		 * System.out.println(stack.removeElement(stack));
		 */

	}
}
