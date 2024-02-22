package com.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Collections;
//import org.apache.commons.lang3.ArrayUtils;

public class StreamApiExample {
	
	public static void main(String args[]) {
		
		Integer[] arr1 = {0, 2, 4, 6, 8, 9, 10};
        Integer[] arr2 = {1, 2, 3, 6, 7, 11, 12, 13};
        List<Integer>list=Arrays.asList(arr1);
        List<Integer>ff=new ArrayList<>(List.of(arr1));
        ff.forEach(element -> {
        	int count = Collections.frequency(ff,element);
        	System.out.println(count);
        });
       
       
		
	}
	

}
