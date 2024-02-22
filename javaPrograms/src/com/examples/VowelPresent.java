package com.examples;

public class VowelPresent {
	public static void main(String[] args) {
		
		
		System.out.println(vowelIsPresent("efsfhb"));
	}
   public static boolean vowelIsPresent(String str) {
	   return str.toLowerCase().matches(".*[aeiou]*.");
	   
	   
   }
}
