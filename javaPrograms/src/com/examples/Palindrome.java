package com.examples;

public class Palindrome {
	
	public static void main(String[] args) {
		
		
       
		String str2 ="aba";
		StringBuilder ff=new StringBuilder(str2);
		StringBuilder dd=ff.reverse();
		String s1=str2.toString();
		String s2=dd.toString();
	if(s1.equals(s2)) {
			System.out.println("string is palindrome");
		}
		
	}
	
	

}
