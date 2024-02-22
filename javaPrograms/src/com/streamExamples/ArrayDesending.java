package com.streamExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayDesending {
	public static void main(String[] args) {
		
//		Integer arr[] = {2,3,4,1,5,6,9,8,7};
//		Arrays.sort(arr,Collections.reverseOrder());
//		for(Integer nn:arr) {
//			System.out.println(nn);
//		}
		List<Integer> l = Arrays.asList(1,3,5,4,2,5);
		Collections.sort(l);
	
		Collections.reverse(l);
		l.forEach(System.out::println);
		
		Set<Integer> s = new  LinkedHashSet<>();
		for(Integer n:l) {
			System.out.println(n);
			
		}
		
		
	}

}
