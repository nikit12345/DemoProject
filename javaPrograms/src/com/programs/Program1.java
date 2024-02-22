package com.programs;



public class Program1 {// second non repeating
	
	public static void main(String[] args) {
		String s1="jabsd";
		char result =secondNonRepeat(s1);
		if(secondNonRepeat(s1)!=0) {
			System.out.println(result);
		}
	}

private static char secondNonRepeat(String s1) {
	int[] count = new int[256];
	for(char ch: s1.toCharArray()) {
		count[ch]++;
	}
	int secondNonRepeat=0;
	for(char ch:s1.toCharArray()) {
		if(count[ch]==1) {
			secondNonRepeat++;
			if(secondNonRepeat==2) {
				return ch;
			}
		}
	}
	return 0;
	
}
}
