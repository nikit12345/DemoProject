package com.streamExamples;

public class Product {
	
	private int id;
    private String name;
    private int prise;
    
    
    
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, int prise) {
		super();
		this.id = id;
		this.name = name;
		this.prise = prise;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrise() {
		return prise;
	}
	public void setPrise(int prise) {
		this.prise = prise;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", prise=" + prise + "]";
	}
    
    
}
