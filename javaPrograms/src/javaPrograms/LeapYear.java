package javaPrograms;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter year");
		int year = sc1.nextInt();
		
		if(year % 4 ==0  && year % 100 !=0 || year % 400 ==0) {
			System.out.println("leap year");
		}else {
			System.out.println("not leap year");
		}
		int [] a= {1,2,3,4,5};
	
		for(int c=0; c<=a.length-1; c++) {
			System.out.println(a[c]);
		}

	}
	
	
}
