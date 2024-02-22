package javaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RepeatCharinString {
	public static void main(String[] args) {
		String str = "abbcccddddee";
		//removeRepeatChar(str);
		
		

		String ss ="jsdjsbacjuwdwjdwccweq";
		Map<Character , Integer> hh = new HashMap<>();
		
		for(Character ch: ss.toCharArray()) {
			if(hh.containsKey(ch)) {
				hh.put(ch, hh.get(ch)+1);
			}else {
				hh.put(ch,1);
			}
		}
		System.out.println(hh);

	}

	private static void removeRepeatChar(String str) {
        HashMap<Character, Integer> h = new HashMap<Character, Integer>();
		for(char ch : str.toCharArray()) {
			h.put(ch, h.getOrDefault(ch, 0)+1);
		}
		System.out.println(h);
	}
	
	
}
