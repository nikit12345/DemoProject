package com.examples;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FactorialUsingRecursive {
	
	public static void main(String[] args) {
		long n=5;
		long result=factorial(n);
		System.out.println("factorial of "+n+" is "+result);
		
		List<Integer> l = List.of(1,2,3,4,5);
		List<Integer> collect= l.stream().filter(a->a%2==0).collect(Collectors.toList());
		System.out.println(collect);
		
	}

	private static long factorial(long n) {
		if(n==0) {
			return 1;
		}else  {
			return n* factorial(n-1);
		}
		
		
	}

}
