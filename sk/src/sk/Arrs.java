package sk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Arrs {
	public static void main(String[] args) {

		
		 int[] arr1 = { 1, 2, 3, 4, 5 };
		  List<Integer> list=Arrays.stream(arr1).boxed().collect(Collectors.toList());
		 for(Integer n:list) {
			 System.out.print(n +" ");
		 }
		 Set<Integer> set=new LinkedHashSet<>();
		 set.add(10);
		 set.add(20);
		
		 set.add(30);
		 set.add(240);
		 set.add(208);
		 System.out.println(set);
		 List<?> al= Arrays.asList("abcd","egdh",1,23,false,45.10);
		
		  int[] arr2 = new int[arr1.length];
		  
		  for (int i = 0; i <= arr1.length - 1; i++) { arr2[i] = arr1[i];}
		  //System.out.println(arr2[i]); }
		  
		  for(int i = 0; i< arr1.length;i++) { System.out.println(arr1[i]+" "); }
		  
		  
		  for(int i = 0; i< arr2.length;i++) { System.out.print(arr2[i]+" "); }
		 
			
			  ArrayList<?> ae = new ArrayList<>(3); 
			 
		
	}
	

}
