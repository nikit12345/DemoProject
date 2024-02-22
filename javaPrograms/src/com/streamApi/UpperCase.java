package com.streamApi;

import java.util.HashSet;
import java.util.TreeSet;

public class UpperCase {

	public static void main(String[] args) {
//		List<String> ls = Arrays.asList("nikita", "avinash", "jadhav");
//		
//		List<String> upperCaseWords = ls.stream().map(String::toUpperCase)
//				.collect(Collectors.toList());
//		System.out.println(upperCaseWords);
//		
//		List<String> names = Arrays.asList("avi", "apple","aru","gh");
//		
//		List<String> startsWithA=names.stream().filter(name -> name.startsWith("a"))
//				.map(String::toUpperCase).collect(Collectors.toList());
//		System.out.println(startsWithA);
//		
//		List<Integer> numbers = Arrays.asList(1,2,5,2,8,4,7,6,9,1,3,3);
//		
//		Integer secondLargest = numbers.stream().distinct().sorted(Comparator.reverseOrder())
//				.skip(1).findFirst().orElse(null);
//		System.out.println(secondLargest);
		
		HashSet<Integer> set = new HashSet<>();
		set.add(9);
		set.add(0);
		set.add(8);
		set.add(6);
		System.out.println(set);
		
		TreeSet<Integer> set2 = new TreeSet<>();
		set2.add(5);
		set2.add(5);
		set2.add(6);
		set2.add(4);
		System.out.println(set2);
	}
}
