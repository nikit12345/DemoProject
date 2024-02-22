package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conversion {
	
	public static void main(String[] args) {
		double d = 78.90;
		String s = String.valueOf(d);
//		String s1 = Double.toString(d);
//		String s2 = s1.replace("78","11");
//		System.out.println(s2);
//		
//	   double dd=9; int aa=6;
//	   
//	   //double to int
//	   aa = (int) dd;
//	   System.out.println(aa);
//	   // int to double 
//	    dd = (double) aa;
//	    System.out.println(dd);
//	    
//	    Scanner sc = new Scanner(System.in);
//	    String str = sc.nextLine();
//	    String str2 = sc.nextLine();
//	    
		String original = "edcba";
		char[] chars = original.toCharArray();
		Arrays.sort(chars);
		String sorted = new String(chars);
		System.out.println(sorted);
		String str= "This#string%contains^special*characters&.";
	   str=str.replaceAll("[^a-zA-Z0-9]"," ");
	   System.out.println(str);
	  Integer[] cccc= {2,4,5};
    
	  List<Integer> lss= new ArrayList(Arrays.asList(cccc));
	  lss.add(90);
	  System.out.println(lss);

	   
	   
		
	}

}
