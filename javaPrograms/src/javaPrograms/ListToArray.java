package javaPrograms;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListToArray {
	
	public static void main(String[] args) {
		

		String in = "avinash";
        Map<Object, Long> map = in.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));

        Optional<Object> firstNonRepeating = map.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        firstNonRepeating.ifPresent(System.out::println);
        
       System.out.println("---------"); 
        String v2="avinash";
        char[] cc=v2.toCharArray();
        Map<Character,Integer>mas=new LinkedHashMap<>();
        for(int i=0;i<cc.length;i++) {
        	
        	mas.put(cc[i],mas.getOrDefault(cc[i],0)+1);
        }
        
        for(Map.Entry<Character,Integer> vv:mas.entrySet()) {
        	if(vv.getValue()==1) {
        		System.out.println(vv.getKey());
        		break;
        		
        	}
        }
        String input = "aaabbbccc";
        StringBuilder output = new StringBuilder();

        char currentChar = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            char nextChar = input.charAt(i);
            if (nextChar == currentChar) {
                count++;
            } else {
                output.append(currentChar).append(count);
                currentChar = nextChar;
                count = 1;
            }
        }

        // Append the last character and its count
        output.append(currentChar).append(count);

        System.out.println(output.toString());
        
        
        String input1 = "aaabbbccc";

        String output1 = input1.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream()
                .map(entry -> entry.getKey().toString() + entry.getValue())
                .collect(Collectors.joining());

        System.out.println(output1);
        
        List<Integer> h = Arrays.asList(2,3,4,5);
        Integer a[]= new Integer[h.size()];
        a=h.toArray(a);
        
}
}
