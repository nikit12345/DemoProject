package com.streamApi;

public class Substring {
	 
	
	public static void main(String[] args) {
		
		product gg=product.getsingl();
		String ee=gg.show();
		System.out.println(ee);
		String result ="";
		
		
		if(result.isBlank()) {
			System.out.println("trueeB");
		}
		else {
		System.out.println("falseB");
		}
		if(result.isEmpty()) {
			System.out.println("trueeE");
		}
		else {
		System.out.println("falseE");
		}
		             //01234567
		//String gg=result.trim(); 
		//int bb=result.indexOf("ggf",1);
		System.out.println(gg);
		//System.out.println(gg);
		/*
		 * System.out.println(gg); int len=result.length(); int count=0; StringBuilder

		 * sb=new StringBuilder(); for(int i=0;i<len;i++) { for(int j=i+1;j<=len;j++) {
		 * 
		 * count+=(result.substring(i,j)).length();
		 * System.out.println(result.substring(i,j)); } } System.out.println(count);
		 */
	}
	

}//i=0,j=1,//abc a,/b/c /abc=a,ab,abc
