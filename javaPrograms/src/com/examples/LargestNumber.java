package com.examples;

import java.util.Arrays;

public class LargestNumber {
	
	public static void main(String[] args) {
		
	
	int[] num= {4,3,4,6,4,3,4,5,6,22};
	int max=num[0];
	for(int i=1; i<num.length;i++) {
		if(num[i]>max) {
			max=num[i];
		}
	}
	System.out.println(max);

}
}