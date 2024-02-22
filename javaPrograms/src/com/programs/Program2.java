package com.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program2 {//secondMost repeated
	
	public static void main(String[] args) {
		String[] s1={"apple","ball","cat","apple","ball","dog"};
		System.out.println(findSecondMostRepeated(s1));
		
		String s="nikita";
		StringBuffer sb = new StringBuffer();
		sb.append(s);
		sb.reverse().toString();
		String s2=sb.toString();
		if(s.equals(s2)) {
			System.out.println("palindrome");
		}
		String f="asdsa";
		
		
	}
	public static String findSecondMostRepeated(String[] s1) {
		 Map<String, Integer> frequencyMap = new HashMap<>();

	        // Count the frequency of each string in the sequence
	        for (String str : s1) {
	            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
	        }
		List<Map.Entry<String, Integer>> sortedEntry= new ArrayList<>(frequencyMap.entrySet());
		Collections.sort(sortedEntry,(entry1, entry2)->entry2.getValue().compareTo(entry1.getValue()));
		return sortedEntry.get(1).getKey();

}}
