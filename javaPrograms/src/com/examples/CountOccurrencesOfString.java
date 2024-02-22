package com.examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrencesOfString {
	public static void main(String[] args) {
		String str="abkdskjsd";
		Map<Character, Integer > map=new HashMap<>();
		for(char cc: str.toCharArray()) {
			map.put(cc,map.getOrDefault(cc,0)+1);
		
		}
		System.out.println(map);
		 String str1 = "hello world";
	        Map<Character, Long> occurrences = countOccurrences(str);
	        
	        // Print occurrences
	        System.out.println("Occurrences of each character in the string:");
	        occurrences.forEach((character, count) ->
	                System.out.println(character + ": " + count));
	        
	        System.out.println("____________");
	        int[] nums = {3, 7, 1, 2, 8, 4, 5}; // Array with one missing number
	        int missingNumber = fmissingNumberFinder(nums);
	        
	        List<Integer> oo= Arrays.asList(1,2,3,4,5,6,7,9,10);
	        int y=oo.size()/2+1;
	        System.err.println(y+"size");
	        System.out.println("The missing number is: " + missingNumber);
	        if(oo.size()%2==0) {
	        	System.out.println("no middle element");
	        }else {
	        	System.out.println("middle ="+y);
	        }
	}

	
	public static Map<Character, Long> countOccurrences(String str1) {
		return str1.chars().mapToObj(c-> (char) c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	}
	
	public static int fmissingNumberFinder(int[] nums ) {
		int n=nums.length+1;
		int sumOfNNumbers= n*(n+1)/2;
		int sumOfArray=0;
		for(int num:nums) {
			sumOfArray=num+sumOfArray;
		}
		return sumOfNNumbers-sumOfArray;
				
	}
}
