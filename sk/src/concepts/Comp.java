package concepts;

import java.util.TreeSet;

public class Comp{
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>(new MyComp());
		set.add(100);
		set.add(10);
		set.add(20);
		System.out.println(set);
	}
}
