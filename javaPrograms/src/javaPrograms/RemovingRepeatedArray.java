package javaPrograms;

import java.util.ArrayList;
import java.util.*;


public class RemovingRepeatedArray {
	public static void main(String[] args) {

		int aa[] = {4,2,4,5,6,7,9,7,6,5,5,4};
		System.out.println(aa.length);
		Set<Integer> hh = new HashSet<>();
		List<Integer> ll = new ArrayList<>();
		for(int vall:aa) {
			if(!hh.add(vall)) {
				ll.add(vall);
			}
		}
		System.out.println(hh);
		System.out.println(ll);
	}

}
