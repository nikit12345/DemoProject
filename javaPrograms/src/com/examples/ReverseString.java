package com.examples;

import java.util.Arrays;
import java.util.Collections;

public class ReverseString {
	public static void main(String[] args) {
		String s1="niki";
		StringBuilder sb = new StringBuilder(s1).reverse();
		StringBuilder sb2 = sb;
		System.out.println(sb2);
		
		int[] n= {1,2,3,4,5};
	   
		for(int i=n.length-1;i>=0;i--) {
			System.out.print(n[i]+" ");
		}
		
	}

	}
