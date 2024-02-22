package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class HmIteration {
	public static void main(String[] args) {
		
	
	String s1="kasjbda";
	Map<Character , Integer> hm = new HashMap<>();
	hm.put('d', 2);
	hm.put('s', 2);
	System.out.println(hm);
	for(Character ch:s1.toCharArray()) {
		hm.put(ch, hm.getOrDefault(ch, 0)+1);
	}
	System.out.println(hm);
	

}}
