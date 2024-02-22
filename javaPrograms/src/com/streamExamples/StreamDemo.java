package com.streamExamples;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
public static void main(String[] args) {
	

	List<Book> bookList = Arrays.asList(new Book("java", new Auther("abc", "abc@gmail", 40, 'm'),500.0),
			new Book("dsa", new Auther("xyz", "xyz@gmail", 45, 'm'),1000.0),
			new Book("html", new Auther("pqr", "pqr@gmail", 44, 'm'),1500.0));

	Integer sumOfmailAutherAges= bookList.stream().map(Book::getAuther)//stream book to stream auther
			.filter(a->a.getGender()=='m')
			.map(Auther::getAge)// stream auther to stream age
			.filter(age -> age<50)
			.reduce(0, Integer::sum);//
	
		System.out.println(sumOfmailAutherAges);
	
}
}
