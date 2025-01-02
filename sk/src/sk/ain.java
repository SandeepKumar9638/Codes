package sk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ain{
	public static void main(String[] args) {
	
		ArrayList<String> list=new ArrayList<>();
		list.add("sa");
		list.add("nd");
		list.add("ee");
		list.add("p");
		System.out.println(list);
		
		Set<String> set=new HashSet<>();
		set.add("sa");
		set.add("cv");
		set.add("bg");
		set.add("de");
		System.out.println(set);
		
		Set<String> set1=new LinkedHashSet<>();
		set1.add("sa");
		set1.add("cv");
		set1.add("bg");
		set1.add("de");
		System.out.println(set1);
}}

  