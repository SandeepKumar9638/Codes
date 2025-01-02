package concepts;

import java.util.Comparator;
import java.util.TreeSet;

public class Examptree {

	public static void main(String[] args) {
		TreeSet set = new TreeSet<>(new Mycomprator());
		set.add("A");
		set.add(new StringBuffer("ABC"));
		//set.add(new StringBuffer("A"));
		set.add("ABCD");
		set.add("XX");
		set.add("A");
		System.out.println(set);
	}

}

class Mycomprator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		int i1 = s1.length();
		int i2 = s2.length();
		if(i1<i2)
			return -1;
		else if (i1>i2)
			return +1;
		else
			return s2.compareTo(s1);
		
	}

}
