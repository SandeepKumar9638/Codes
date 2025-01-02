package questionsPrac;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

public class Q1 {
	public static void main(String[] args) {

		List<Integer> name = Arrays.asList(11, 22, 3, 4, 5, 6);

		List<Integer> odd = new ArrayList<>();
		List<Integer> even = new ArrayList<>();

		for (int i : name) {
			if (i % 2 == 0) {
				even.add(i);
			} else {
				odd.add(i);
			}
		}
		System.out.println("even");
		for (int j = 0; j < even.size(); j++) {
			System.out.println(even.get(j));
		}
		System.out.println("odd");
		for (int k = 0; k < odd.size(); k++) {
			System.out.println(odd.get(k));
		}

		name.stream().forEach(i -> {
			if (i % 2 == 0) {
				System.out.println(i + " even");
			}
			if (i % 2 != 0) {
				System.out.println(i + " odd");
			}
		});

		List<String> lm = name.stream().map(i -> i % 2 == 0 ? i + "even" : i + "odd").collect(Collectors.toList());
		System.out.println(lm);

		
		int[] a= {58,96,78,4523};
		for (int i = 0; i <= name.size()-1; i++) {
			int y = name.get(i);
			if (y % 2 == 0)
				System.out.println(y + " even");
			else {
				System.out.println(y + " odd");
			}

		}

	}

}
