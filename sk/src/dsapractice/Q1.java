package dsapractice;

import java.util.ArrayList;
import java.util.List;

public class Q1 {

	public static void main(String[] args) {
		
		List<List<Integer>>al = new ArrayList<>();
al.addAll(al);
		int[] a = {1,3,4,6,5,8,9};
		int target = 10;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i]+a[j]==target) {
					System.out.println(a[i]+","+a[j]);
				}
				
			}
		}
		

}}
