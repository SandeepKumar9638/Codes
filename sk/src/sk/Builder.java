package sk;

import java.util.ArrayList;
import java.util.Arrays;

public class Builder {
	public static void main(String [] args) {
		
		  StringBuilder sb1=new StringBuilder("dbhf"); 
		  StringBuilder sb2= new StringBuilder(" "+"fan");
		  sb1.capacity();
		  sb1.append(sb2);
		  System.out.println(sb1);
		 
		
		  String s="sigh";
		  
		  
		  
		  String b= "ing";
		   //String h = String.join("",s, b) ;
		   
		 String[] h = s.split("i");
		System.out.println(Arrays.toString(h));
		
		String f = s.concat(b);
		System.out.println(f);
		 
	}
		
	}


