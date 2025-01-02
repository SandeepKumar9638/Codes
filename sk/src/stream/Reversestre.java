package stream;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class Reversestre {
	public static void main(String[] args) {
		
		
		Stack<Object> sta= new Stack<>();
		sta.add(1);
		sta.add(3);
		System.out.println(sta);
		System.out.println(sta.pop());
		Vector<Object> v= new Vector<>();
		
		for(int i =0;i<10;i++) {
			v.add(i);
		}
		Iterator i = v.iterator();
		while(i.hasNext()) {
			
		}
		//System.out.println(v.add("A"));
		System.out.println(v);
		
		
		
		System.out.println(v.capacity());
		
		Enumeration<Object> e = v.elements();
		while(e.hasMoreElements()) {
			Integer itr = (Integer) e.nextElement();
			if(itr % 2 ==0)
				System.out.print(itr);
		}
	}
	/*public static Integer m1() {
		int a=10;
		int b= a;
		a=20;
		return b;
	//	return a;
	}*/

}
