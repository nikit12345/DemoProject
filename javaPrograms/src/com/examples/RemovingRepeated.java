package com.examples;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemovingRepeated {
	public static void main(String[] args) {
		
	
	Integer[] n= {1,2,1,2,3,2,2,4,5,6,65,4};
	
	

	Set<Integer> set = new HashSet<>();
	for(Integer nn:n) {
		set.add(nn);
	}
	System.out.println(set);
	}
}
