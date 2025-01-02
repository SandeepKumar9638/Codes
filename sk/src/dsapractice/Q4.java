package dsapractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q4 {
	List<Integer> list1=new ArrayList<Integer>();
	 HashSet<Integer> integers=new HashSet<Integer>();
	 List<Integer> list=new ArrayList<Integer>();
	 public  List<Integer> threeSum(int[] nums) {
	 
		 int sum=0;
		 for(int i=0;i<=nums.length-1;i++)
		 {
			 for (int j = i; j < nums.length; j++) {
				 sum=sum+nums[j];
			
			 
		// List<Integer> list=new ArrayList<Integer>();
		 list.add(nums[i]);
		// HashSet<Integer> integers=new HashSet<Integer>(list);
		 
		 if(sum==0)
		 {
			 HashSet<Integer> integers=new HashSet<Integer>(list);
			 //integers.add(sum);
			 for(int j1:integers) {
				 //System.out.println(j);
			 }
			 System.out.println(integers);
		 }
		list1.addAll(integers);
		//return integers;
	 }}
		 return list1;
	 }
	 
	 
	 public static void main(String[] args) {
		 
		// int []a= {1,2,6,-,4,-10,7,1,2,-3,8,8,-16};
		 int[] a= {-1,0,1,2,-1,-4};
		 Q4 q4=new Q4();

	
	 q4.threeSum(a);
	}
}
