package sk;

public class sem {
	public static void main(String args[]) {
		int a = 5;
		int b = 7;
		a= a+b-(b=a);
//		a= a+b;
//		b= a-b;
//		a = a-b;
		System.out.println(a);
		System.out.println(b);
		
		String s= "sfsgdh";
		int t=s.length()-2;
		System.out.println(s.substring(t));
	}

}
