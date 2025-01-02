package justPrac;

import java.util.Arrays;
import java.util.HashSet;

class W2 extends W2abstract {

	public void missing(int[] a) {

		Arrays.sort(a);
		HashSet<Integer> name = new HashSet<Integer>();
		for (int integer : a) {
			name.add(integer);
		}
		System.out.println(name);
		int min = a[0];
		int max = a[a.length - 1];
		System.out.println(max);
		for (int i = min; i < max; i++) {
			if (!name.contains(i)) {
				System.out.println("miss" + i);
			}
		}

	}

	public static void main(String[] args) {

		W2abstract name = new W2();
		name.missing(new int[] { 1, 4, 9 });

		name.string();
	}

	public void string() {
		System.out.println("hi");

	}

}
