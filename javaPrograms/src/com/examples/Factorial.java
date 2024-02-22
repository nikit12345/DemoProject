package com.examples;

import java.util.Arrays;
import java.util.Collections;

public class Factorial {
	
	public static void main(String[] args) {
		int n=4, fact=1;
		for(int i=1;i<=n;i++) {//5<5
			fact=fact*i;
		}
		System.out.println(fact);
		
		
		Integer[] nn= {3,4,6,4,4,3,1,1,2,2,4,8};
		int aa=nn.length;
		secondLarg(nn,aa);
		
			}
	
	
	public static void secondLarg(Integer n[], int length) {
		Arrays.sort(n, Collections.reverseOrder());
		for(int i=0;i<length-1;i++) {
			if(n[0]!=n[i]) {
				System.out.println("second largest "+n[i]);
				break;
			}
		}
		String str="hsava";
		secondNonRepeating(str);
		
	}
	
	public static char secondNonRepeating(String str) {
		int[] charCount= new int[256];
		for(char ch: str.toCharArray()) {
			charCount[ch]++;
		}
		for(char ch: str.toCharArray()) {
			charCount[ch]++;
			if(charCount[ch]==2) {
				System.out.println();
			
		}}
		return 0;
	}
}
