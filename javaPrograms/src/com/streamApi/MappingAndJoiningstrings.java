package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingAndJoiningstrings {
	
	public static void main(String[] args) {
		
		List<String > words = Arrays.asList("apple", "banana", "cherry", "date");
		
		String concatenatedUpper = words.stream().
				map(String :: toUpperCase)
				.collect(Collectors.joining(", "));
		
		System.out.println(concatenatedUpper);
		
	}

}
