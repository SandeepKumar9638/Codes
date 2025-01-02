package patterns;

import java.util.Arrays;
import java.util.Random;

public class Pattern4 {
	public static void main(String[] args) {
	
		Random rat= new Random();
		
		int x=rat.nextInt(6);
		int y =rat.nextInt(6);
		int z=rat.nextInt(6);
		
		int[] o= new int[3];
		
		o[0]=x;
		o[1]=y;
		o[2]=z;
		Arrays.sort(o);
		/*int pqr=0;
		int opq=0;*/
		int pqr=o[o.length-1];
		int opq=o[o.length-2];
		
		System.out.println(pqr);
		System.out.println(opq);
		System.out.println("this is for p1");
			System.out.println(pqr+opq);
			System.out.println();
			
			int a=rat.nextInt(6);
			int b =rat.nextInt(6);
			int c=rat.nextInt(6);
			
			int[] no= new int[3];
			no[0]=a;
			no[1]=b;
			no[2]=c;
			
			Arrays.sort(no);
			
		//	for (int i = 0; i < no.length; i++) {
				int hj=no[no.length-1];
				int ju=no[no.length-2];
				
				System.out.println(hj);
				System.out.println(ju);
				System.out.println("this is for p2");
				System.out.println(hj+ju);
				int kl= (hj+ju);
				int jkl=pqr+opq;
				
				System.out.println("final output winner value");
				System.out.println(Math.max(kl, jkl));
				
			//}
		
	

		/*System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("z = "+z);
		int u = x+y+z;
		
	int re=	 Math.max(y, x);
	int rx=Math.max(z, re);
	Math.max(re, rx);
	System.out.println("re = "+re);
	System.out.println("rx = "+rx);
		System.out.println(re+rx);
/*	int a= rat.nextInt(6);
		 int b= rat.nextInt(6);
		 int c= rat.nextInt(6);
		 int d = a+b+c;
		System.out.println("sum of x,y,z"+ "="+u);
		System.out.println(d);
		
		if(u>=d) {
			System.out.println("modi");
		}
		else if(u<=d) {
			System.out.println("rahul");
		}
		else {
			System.out.println("tie");
		}*/
}
}
