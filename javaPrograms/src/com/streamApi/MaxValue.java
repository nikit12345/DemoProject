package com.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxValue {
	public static void main(String[] args) {
		
		
		String xx="aaghddt";
		Map<Object, Long> map=xx.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(s->s,Collectors.counting()));
		map.forEach((key,value)->{
			System.out.println("key"+key+"value"+value);
		});
		
	}

	
	}


