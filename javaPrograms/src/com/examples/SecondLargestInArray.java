// Java program to find second largest
// element in an array
package com.examples;
import java.util.Arrays;
import java.util.Collections;
class SecondLargestInArray {

	public static void main(String[] args) {
		Integer arr[]= {1,3,2,3,4,4};
		int n=arr.length;
		secodLargest(arr, n);
	}

	private static void secodLargest(Integer[] arr, int n) {
		
		Arrays.sort(arr, Collections.reverseOrder());
		for(int i=1; i<n; i++) {//4,3,2,1
			if(arr[i]!=arr[0]) {
				System.out.println(arr[i]);
				return;
			}
		
	}
}
}