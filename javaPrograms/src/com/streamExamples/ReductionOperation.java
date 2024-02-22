package com.streamExamples;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//if you want to perform more complex reduction operation you must use reduce method





public class ReductionOperation {
	public static void main(String[] args) {
		int[] numberArray = {2,3,4,5,6};
		int num = Arrays.stream(numberArray).sum();
		System.out.println(num);
		
		long count = Arrays.stream(numberArray).count();
		System.out.println(count);
		
		OptionalDouble average = Arrays.stream(numberArray).average();
		System.out.println(average.getAsDouble());
		
		
		String[] strArray= {"welcome " ,"to ","india "};
		String result = Arrays.stream(strArray).reduce("",(a, b )-> a+b);
		System.out.println(result);
		
		
		//creating stream using stream.of
		Stream<Integer> stream = Stream.of(1,2,3,4,4);
		stream.forEach(p->System.out.print(p+" "));
		System.out.println();
		
		//creating stream using stream.of(array of elements)
		Integer[] intArray= {1,2,3,4,5,67,7};
		Stream<Integer> stream2=Stream.of(intArray);
		stream2.forEach(p->System.out.print(p+" "));
		System.out.println();
		
		//using someList.stream
		List<Integer> l= Arrays.asList(1,2,3,4,5,6,7);
		Stream<Integer> stream3= l.stream();
		stream3.forEach(p->System.out.print(p+" "));
		
		//convert stream to list using collect method
		List<Integer> l2= Arrays.asList(1,2,3,4,5,6);
		Stream<Integer> stream4= l2.stream();
		
		List<Integer> l3= stream4.filter(i-> i%2==0).collect(Collectors.toList());
		
		
		//convert stream to array using toArray
		Integer[] l4= stream4.filter(i-> i%2==0).toArray(Integer[]::new);
		l3.forEach(p->System.out.println(p));
	}

}
