package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class Test{
	public int add(int a,int b) {
		System.out.println("Test");
		return a+b;
	}
	
}
class ABC extends Test{
	
	public int add(int a,int b) {
		System.out.println("ABC");
		return a-b;
	}
	}

class MethodOverride{
	
	
	public static void main(String[] args) {
		
		
		int num1=0,num2=1;
		int n=10;
		for(int i=0;i<=n;i++) {
			System.out.println(num1);
			
			int num3=num1+num2;
			num1=num2;
			num2=num3;
		}
		
		int count=1;
	
		for(int i=1;i<=5;i++) {
			count*=i;
			
		}
		System.out.println(count);
		
		String ab="asaad#dfdfd#dfdfd";
		String[] bb=ab.split("#");
		for(String vv:bb) {
			System.out.println(vv);
		}
		
		String in="avinash";
		String rr=in.substring(5);
		System.out.println(rr);
		
		String g="4";
	    int b=	Integer.parseInt(g);
	    System.out.println(b);
		
    }
}