package sk;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		
		int a=98;
		int l=87;
		
		a=a^l;
		l=a^l;
		a=a^l;
		System.out.println(a);
		System.out.println(l);
		
		
		int q=67;
		int p=90;
		q=q+p-(q=p);
		p=q+p-(q=p);
		
		System.out.println(q);
		System.out.println(p);
		Scanner sc= new Scanner(System.in);
		String s = sc.next();
		
		for(int i=s.length()-1;i>=0;i--) {
			char c=s.charAt(i);
		System.out.print(c);
		}
		sc.close();
		
		System.out.println();
		
		
		String t="sandeep";
		

		for(int i=t.length()-1;i>=0;i--) {
			char y=t.charAt(i);
		System.out.print(y);
		}
		System.out.println();
		
		String u="fan";
		String j="";
		for(int i=u.length()-1;i>=0;i--) {
			char e=u.charAt(i);
			j+=e;
		}System.out.println(j);
		
		
}}
		
