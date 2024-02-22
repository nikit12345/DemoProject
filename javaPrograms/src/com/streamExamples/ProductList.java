package com.streamExamples;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;

public class ProductList {
	public static void main(String[] args) {
		List<Product> prodList = new ArrayList<>();
		prodList.add(new Product(1,"lenovo",30000));
		prodList.add(new Product(2,"abc",60000));
		prodList.add(new Product(3,"xyz",40000));
		
		Set<Integer> prodPriseSet = prodList.stream().filter(p->p.getPrise()<50000).map(p->p.getPrise())
				                     .collect(Collectors.toSet());
		System.out.println(prodPriseSet);
		
		System.out.println("converting prodList to map");
		Map<String,Integer> prodListMap = prodList.stream().collect(Collectors.toMap(
				                          p->p.getName(), p->p.getPrise()));
		
		System.out.println(prodListMap);
		System.out.println("method reference in stream");
		
		List<String> productName = prodList.stream().filter(p->p.getPrise()<50000).map(Product::getName)
				                       .collect(Collectors.toList());
		System.out.println(productName);
		System.out.println("Iterate method of stream");
		
		Stream.iterate(1, n-> n+1).filter(n->n%2!=0).limit(5).forEach(System.out::println);
		
		System.out.println("filter prodList based on prise");
		List<Product> filteredProductList = prodList.stream().filter(p->p.getPrise()>30000).collect(Collectors.toList());
		//System.out.println(filteredProductList);
		
		// Check if any elements were filtered out
		if (filteredProductList.isEmpty()) {
		    System.out.println("No products with price > 30000 found.");
		} else {
		    System.out.println(filteredProductList);
		}

	}
	
	

}
