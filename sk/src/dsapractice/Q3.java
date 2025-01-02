package dsapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Q3 
{
	 public List<List<Integer>> threeSum(int[] nums) {
	        List<List<Integer>> al= new ArrayList<>();
	      // Set<Set<Integer>>hs = new LinkedHashSet<>();
	        for(int i=0;i<nums.length;i++)
	        {
	                for(int j=0;j<nums.length;j++)
	                {
	                    for(int k=0; k<nums.length;k++)
	                    {
	                      if ( (nums[i]+nums[j]+nums[k]==0) && i != j&& i != k && j!=k)
	                      {
	                        al.add(Arrays.asList(nums[i],nums[j],nums[k]));
	                        // hs.add(nums[i]);
	                        // hs.add(nums[j]);
	                        // hs.add(nums[k]);
	                      }
	                      Set<Set<Integer>>hs = new LinkedHashSet<>();

	                    }
	                      

	                }
	            }
	           // hs.add(al);
	       

	                    return al;
	        }


}
