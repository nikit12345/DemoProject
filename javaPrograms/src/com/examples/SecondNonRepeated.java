package com.examples;

public class SecondNonRepeated {
	public static void main(String[] args) {
	
		String str ="abcdefg";
		
		char result=secondNonRepeat(str);
		if(result!= '\0') {
			System.out.println("second non repeated char is "+result);
		}

	}

	private static char secondNonRepeat(String str) {
		int[] count = new int[256];
		for(char ch : str.toCharArray()) {
			count[ch]++;
		}
		int secondLargestCount=0;
		for(char ch :str.toCharArray()) {
			if(count[ch]==1) {
				secondLargestCount++;
				if(secondLargestCount==2) {
					
					
					return ch;
				}
			}
		}
		return 0;
		
	}

}
