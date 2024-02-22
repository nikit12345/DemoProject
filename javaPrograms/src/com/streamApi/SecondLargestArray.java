package com.streamApi;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestArray {
	
		
		public static void main(String[] args) {
		
			int[] num = {1, 2, 3, 4, 5};

			for (int i = 0; i < num.length - 1; i += 2) {
			    num[i] = num[i] + num[i + 1];
			    num[i + 1] = num[i] - num[i + 1];
			    num[i] = num[i] - num[i + 1];
			}

			System.out.println("Swapped array: " + Arrays.toString(num));
		Arrays.sort(num);
		
	}
}
