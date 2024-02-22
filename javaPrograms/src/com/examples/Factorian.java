package com.examples;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Factorian {
	
	public static void main(String[] args) {
		String input="avinash";
		Map<Object,Long> charCount=new LinkedHashMap<>();
		 charCount = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		charCount.forEach((key,value)->{
			if(value==1) {
				System.out.println("value"+value+"key"+key);
				
			}
		
         
	});

}
}
