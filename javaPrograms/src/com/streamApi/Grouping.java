package com.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;

class Filter{
	public static Predicate<Employee> getEmapNameEnds(String prefix){
		return name->name.getName().endsWith(prefix);
		
	}
}



class Employee{
	private int id;
	private String name;
	private String group;
	private double salary;
	public Employee(int id, String name, String group, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.group = group;
		this.salary = salary;
	}
	
	public Employee() {
		
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

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
public class Grouping {
	public static void main(String[] args) {
		
	List<Employee> list=new ArrayList<Employee>();
	list.add(new Employee(101,"emp1","A",60000));
	list.add(new Employee(102,"emp1","e",70000));
	list.add(new Employee(103,"emp2","d",80000));
	list.add(new Employee(101,"emp3","d",60000));
	//list.stream().filter(n->n.getDept()=="civil").mapToInt(Student::getMarks).average();
	
	OptionalDouble gg=list.stream().filter(n->n.getName().endsWith("1")).mapToDouble(Employee::getSalary).average();
	System.out.println(gg);
	
	}
	
	

	
}
