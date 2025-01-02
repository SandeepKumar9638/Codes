package concepts;

import java.util.TreeSet;

public class EmployeeId implements Comparable {
	
	 String string;
	 int i;

	public EmployeeId(String string, int i) {
		this.string=string;
		this.i=i;
		}
	public String toString() {
		return (string+"[--]"+i);
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		EmployeeId e1= new EmployeeId("n",10);
		EmployeeId e2= new EmployeeId("jn",10);
		EmployeeId e3= new EmployeeId("nr",10);
		EmployeeId e4= new EmployeeId("nwe",10);
		EmployeeId e5= new EmployeeId("wen",10);
		
		TreeSet name = new TreeSet();
		name.add(e1);
		name.add(e2);
		name.add(e3);
		name.add(e4);
		name.add(e5);
		System.out.println(name);
	}

	
	

}
