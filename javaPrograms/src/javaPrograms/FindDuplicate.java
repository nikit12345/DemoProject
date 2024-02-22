package javaPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {
	public static void main(String[] args) {
		String input = "hgshgaeerrttqqwwwwhhhhhpppp";
		findDuplicate(input);
}

	private static void findDuplicate(String input) {
		Set<Character> ss=new HashSet();
		List<Character> list=new ArrayList();
		for(char c:input.toCharArray()) {
			if(!ss.contains(c)) {
				ss.add(c);
			}
			else {
				list.add(c);
			}
		}
		
		System.out.println(list);
		System.out.println(ss);
		
		
	
	} 

/*
 * private static void findDuplicate(String str) { Map<Character, Integer>
 * charCount = new HashMap<>(); for( char c : str.toCharArray()) {
 * charCount.put(c,charCount.getOrDefault(c,0)+1); } for(Entry<Character,
 * Integer> m:charCount.entrySet()) {
 * System.out.println(m.getKey()+"- "+m.getValue()); }
 * //System.out.println(charCount); }
 */

}
