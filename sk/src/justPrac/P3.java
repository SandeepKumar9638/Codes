package justPrac;

public class P3 {

	public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("abcdefgh");

	char ch='e';
	int j=0;
	StringBuilder s = new StringBuilder();
	for (int i=0;i<sb.length();i++) {
		if(ch==sb.charAt(i)) {
			String ex=sb.substring(0, i+1);
			s.append(ex);
			j++;
			break;
		}
	}
	s.reverse();
	System.out.println(s);
	System.out.println(j);
	}

}
