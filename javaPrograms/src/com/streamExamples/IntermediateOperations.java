package com.streamExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperations {
	
	public static void main(String[] args) {
		List<String> ls=Arrays.asList("niki","neha","sumit","avinash");
		ls.stream().filter((s)->s.startsWith("n")).forEach(System.out::println);
		ls.stream().filter((s)->s.startsWith("n")).map(String::toUpperCase).forEach(System.out::println);
		List<String > upperCaseName=ls.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperCaseName);
		
		boolean matchedResult=ls.stream().anyMatch((s)->s.startsWith("a"));
		System.out.println(matchedResult);
		
	}

}
