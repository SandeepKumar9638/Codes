package stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Incre {
	
	public static void main(String[] args) {
		
		/*List<Character> l = new ArrayList<Character>();
		
		for(int i=33;i<=123;i++) {
			
			char c= (char)(i);
			l.add(c);
		}	
		System.out.println(l);
		System.out.println();*/
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=40;i<=100;i++) {
			char c=(char)i;
			map.put(c,i);
			
		}
		System.out.println("_ | _");
		
		for(Map.Entry en:map.entrySet()) {
			
			System.out.println(en.getKey()+" | "+en.getValue());
		}
		System.out.println("- | -");
	
		
		
		/*for(int i=0;i<l.size();i++) {
			System.out.println(i);
		}*/
		
	}

}
