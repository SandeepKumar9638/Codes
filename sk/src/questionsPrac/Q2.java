package questionsPrac;

import java.util.Arrays;
import java.util.List;

public class Q2 {
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,54,67,89,567);
		System.out.println(list);
		System.out.println("time for even");
		list.stream().filter(h -> h%2==0).forEach(System.out::println);
		System.out.println("time for odd");
		list.stream().filter(n -> n%2 !=0).forEach(System.out::println);
		
	
	}

}
