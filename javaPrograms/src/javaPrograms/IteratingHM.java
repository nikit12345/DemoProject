package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class IteratingHM {
	
	public static void main(String[] args) {
		
		String kk = "jadhav is a java developer";
        
        char[] cc = kk.toCharArray();

        System.out.println("Vowels in the string:");
        kk.chars().mapToObj(c->(char)c).
        filter(IteratingHM::isVowel)
                .forEach(System.out::println);
		
		 Map<Integer, String> map= new HashMap<>();
	      map.put(1,"niki");
	      map.put(2,"sumit");
	     map.forEach((k,  v) ->   System.out.println(k+" "+v));
	      map.forEach((k, v) -> System.out.println(k + " " + v));
    }
		  
	public static boolean isVowel(char c){
			return "aeiou".indexOf(c)!=-1;
		}

}
