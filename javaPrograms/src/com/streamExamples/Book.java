package com.streamExamples;

public class Book {
	
	private String name;
    private Auther auther;
    private double price;
	public Book(String name, Auther auther, double price) {
		super();
		this.name = name;
		this.auther = auther;
		this.price = price;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Auther getAuther() {
		return auther;
	}
	public void setAuther(Auther auther) {
		this.auther = auther;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", auther=" + auther + ", price=" + price + "]";
	}
    
    
    interface animal{
    	public  void dod() ;
    	
    	
    }
    class dog implements animal{

		@Override
		public void dod() {
			System.out.println("this is dog");
			
		}
    	
    }
}
