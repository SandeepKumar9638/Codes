package sk;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sv {
	public static void main(String args[]){
		List<Integer> lis = Arrays.asList(1,2,3,4,5);
		List<Integer> flis= lis.stream().filter(li -> li==3) .collect(Collectors.toList());
		System.out.println(flis);
	}	

}




	
		