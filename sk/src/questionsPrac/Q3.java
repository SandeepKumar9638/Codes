package questionsPrac;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q3 {
	public static void main(String[] args) {
		List<Integer> init= Arrays.asList(1,2,3,4,5,6,6,2,5);
		System.out.println(init);
		Set<Integer> sets= new HashSet<Integer>(init);
		
		System.out.println(sets);
		
		Integer [] inte= {1,1,1,2,5,4,8,4,5,2,6};
		
		for (int i = 0; i < inte.length; i++) {
			for (int j = i+1 ; j < inte.length; j++) {
				if (inte[i]==inte[j]) {
					System.out.print(inte[j]+" ");
					
				}
			}
		}
		System.out.println();
		List<Integer> str =init.stream().distinct().collect(Collectors.toList());
		System.out.println(str);
	}

}