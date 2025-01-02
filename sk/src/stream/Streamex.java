package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streamex {
	public static void main(String[] args) {

		List<String> st = new ArrayList<>() ;	
		st.add("sandeep");
		String string = "sandenep";
		char[] charArray = string.toCharArray();
		for (char c : charArray) {
			if(c=='n') {
				
			}else {
			//	System.out.print(String.valueOf(c));
			}
		}
		Map<String, Long> collect = string.chars().filter(n -> n != 'n').mapToObj(n -> String.valueOf((char) n))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);
		
		TreeMap tree=new TreeMap();
		tree.putAll(collect);
		System.out.println(tree);
	}
}


