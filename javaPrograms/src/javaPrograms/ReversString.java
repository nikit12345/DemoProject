package javaPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class ReversString {
	
	public static void main(String[] args) {
		
		String input="nnikiddsgta";
		char[] ch=input.toCharArray();
		Map<Character,Integer> map=new LinkedHashMap<>();
		
		
		for(char v:ch) {
			map.put(v, map.getOrDefault(v,0)+1);
		}
		System.out.println(map);
		
		int count=0;//1
		for(Map.Entry<Character,Integer> nn:map.entrySet()) {
			
			  if(nn.getValue()==1) 
			  { 
			   count++;
			  if(count==2) {
				  System.out.println(nn.getKey());
			  }
			  }
			 
		}
	
	}
	
	
}