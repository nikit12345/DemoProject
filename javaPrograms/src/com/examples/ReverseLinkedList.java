package com.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ReverseLinkedList {
public static void main(String[] args) {
	
   List<Integer> l=Arrays.asList(1,1,3,5,6,7,4,2,3,4,5,7);
   Collections.reverse(l);
   System.out.println(l);
   for(int i=l.size();i>0;i--) {
	  
   }
   System.out.println(l);
   
   Set<Integer> s= new TreeSet<>();
   for(Integer ii:l) {
	   s.add(ii);
	  
   }
   System.out.println(s);
}
}
