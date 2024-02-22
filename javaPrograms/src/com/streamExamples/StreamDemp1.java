package com.streamExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemp1 {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3,3,5);
		Stream<Integer> stream = l.stream();
		
		System.out.println(stream.count());
System.out.println("How to use map method  to convert all string elements in an array to uppercase");
	
String[] ss = {"nikita", "sumit", "neha", "dksh"};
Stream<String> stream2 = Arrays.stream(ss);
Stream<String> upperCaseStream = stream2.map(nam -> nam.toUpperCase());
String[] upperCaseArray = upperCaseStream.toArray(String[]::new);
for (String name : upperCaseArray) {
    System.out.println(name);
}
          System.out.println(" filter the names whose length is greater than 4");
          
	}
	

}
