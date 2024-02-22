package javaPrograms;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
	public static void main(String[] args) {

		combine("abc");
	}

	private static void combine(String input) {
		List<String> list=new ArrayList<>();
		
		list=show("",input,list);
		System.out.println(list);
		
	}

	private static List<String> show(String prefix, String input, List<String> list) {
		int len=input.length();
		if(len==0) {
			list.add(prefix);
		}
		
		for(int i=0;i<len;i++) {
			String newprefix=prefix+input.charAt(i);
			String newinput=input.substring(0,i)+input.substring(i+1);
			show(newprefix,newinput,list);
		}
		return list;
	}
	
}
