package com.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import java.util.*;

class Emplo {
    private String name;
    private double salary;
    private String dept;

    public Emplo(String name, double salary,String dept) {
        this.name = name;
        this.salary = salary;
        this.dept=dept;
    }

    public double getSalary() {
        return salary;
    }
    
    

    public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class IntToInteger {
	public static void main(String[] args) {
		int n1=0,n2=1;
		for(int i=0;i<10;i++) {
			
			System.out.println(n1);
			int n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		
		List<Emplo> emp=Arrays.asList(new Emplo("nikita",500000,"it"),
				new Emplo("avinash",100000,"hr"),
				new Emplo("anil",400000,"fn"),
				new Emplo("anil",400000,"fn"));
		
		//emp.stream().mapToDouble(Emplo::getSalary).filter(s->s>10000).forEach(System.out::println);
		Map<String,List<Emplo>> map=emp.stream().collect(Collectors.groupingBy(Emplo::getDept));
		map.forEach((name,LIST)->{
			System.out.println("---"+name);
			LIST.forEach(System.out::println);
		});
		String kk = "jadhav is a java developer";

        char[] cc = kk.toCharArray();
        int num[]= {1,2,3,4,5,6};
        for(int i=num.length-1;i>=0;i--) {
        	System.out.println(num[i]);
        }
        int count=Arrays.stream(num).boxed().reduce(0,(a,b)->a+b);
        System.out.println(count);
        System.out.println("Vowels in the string:");
        //new String(cc)
                 kk.chars().mapToObj(c->(char)c)
                .filter(IntToInteger::isVowel)
                .forEach(c -> System.out.println((char) c));
    }

    private static boolean isVowel(int c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
		
	}
