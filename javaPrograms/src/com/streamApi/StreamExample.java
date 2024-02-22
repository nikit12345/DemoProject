package com.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class product{
	
	public static product pr;
	private product() {
		
	}
	
	public String show() {
		return "gggggg";
	}
	public static product getsingl() {
		if(pr==null) {
			pr=new product();
		}
		return pr;
	}
	int id;
	String name;
	long price;
	public product(int id, String name, long price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class StreamExample  {
	
	public static void main(String[] args) {
		
		List<product> ls = new ArrayList<product>();
		ls.add(new product(1,"niki",897));
		ls.add(new product(2,"avi",578));
		ls.add(new product(3,"jhon",1028));
		
		List<Long> ls2 = new ArrayList<Long>();
		for(product p: ls) {
			if(p.price<1000.0) {
				ls2.add(p.price);
			}
		}
		System.out.println();
		//Filtering
		List<String> list1 = Arrays.asList("alice", "bob", "jhon","david");
		List<String> filteredNames = list1.stream().filter(name-> name.startsWith("a"))
				.collect(Collectors.toList());
		System.out.println("Names starting with a : "+filteredNames);
		
		//Mapping
		List<String> list2 = Arrays.asList("alice", "bob", "jhon","david");
		List<Integer> namesLength = list2.stream().map(String::length).collect(Collectors.toList());
		System.out.println("Names Length : "+namesLength);
		
		//Sorting
		List<Integer> list3= Arrays.asList(3,5,2,4,6,8,4,5,4);
		List<Integer> sortedNumbers = list3.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted numbers : "+sortedNumbers);
		
		//Reduction
		
		List<Integer> list4= Arrays.asList(3,5,2,4,6,8,4,5,4);
		int sum = list4.stream().reduce(0,(a,b)->(a+b));
		System.out.println("Sum of numbers : "+sum);
		
		//Collecting
		List<String> list5 = Arrays.asList("alice", "bob", "jhon","david");
		Set<String> namesSet = list5.stream().collect(Collectors.toSet());
		System.out.println("Set");
	}

}
