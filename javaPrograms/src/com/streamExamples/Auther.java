package com.streamExamples;

public class Auther {
	
	private String name;
	private String email;
	private int age;
	private char gender;
	
	
	public Auther() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Auther(String name, String email, int age, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Auther [name=" + name + ", email=" + email + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	

}
