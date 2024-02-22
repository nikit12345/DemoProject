package com.examples;

import java.util.Arrays;

public class Annagram {
	public static void main(String[] args) {
	
	String s1="niki";
	String s2="iikni";
	char[ ] ch1=s1.toCharArray();
	char[] ch2=s2.toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	if(Arrays.equals(ch1,ch2)) {
		System.out.println("anagram");
	}else {
		System.out.println("no anagram");
	}
	System.out.println("_________");
		if(areAnagrams(s1,s2)) {
			System.out.println("are anagram");
		}else {
			System.out.println("not anagram");
		}
		
		}
	
	public static boolean areAnagrams(String str1, String str2) {
		return Arrays.equals(
				str1.chars().sorted().toArray(),
				str2.chars().sorted().toArray());
		
	}
}
