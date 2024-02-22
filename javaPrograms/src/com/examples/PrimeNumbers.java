package com.examples;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static boolean isPrime(int number) {
		if(number<=1) {
			System.out.println("not prime number");
			
		}
		//3
		//9/2==true
		for(int i=2; i<=Math.sqrt(number); i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
	
	 public static void main(String[] args) {
		 int n=13;
		 boolean checkPrime = isPrime(n);
		 
		 if(checkPrime==true) {
			 System.out.println("prime");
		 }else {
			 System.out.println("not prime");
		 }
		 
		 if(isPrime(n)) {
			 System.out.println("prime number");
		 }else {
			 System.out.println("not prime number");
		 }
	       
	    }

}
