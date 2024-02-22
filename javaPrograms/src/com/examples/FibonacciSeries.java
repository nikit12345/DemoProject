package com.examples;

public class FibonacciSeries {
	
	public static void main(String[] args) {

		int a=5;
		int b=10;//15
		b=b+a;
		a=b-a;
	    b=b-a;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("_____");
		
		int a1=0; int a2=1; int a3=2;
		System.out.println(a1+a2);
		for(int i=2; i<10;i++) {
			a3=a1+a2;
			System.out.println(a3);
			a1=a2;
			a2=a3;
		}
		
		
		
		
		
		
		int n1=0, n2=1, n3, count=10;
		
		for(int i=2;i<count; i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		
	}

}
