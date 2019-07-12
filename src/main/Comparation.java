package main;

import java.util.Comparator;

public class Comparation {
	public static void main(String[] args) {
		Employee emp1 = new Employee(18,"João", "Chile");
		Employee emp2 = new Employee(23,"Carlos", "Brazil");
		
		Comparable<Employee> comp = null;
		
		int result = comp.compareTo(emp2);
		
		
	}
}
			

class Employee{
	
	public Employee() {
		
	}
	
	public Employee(int age,String name,String country) {
		age = this.age;
		name = this.name;
		country = this.country;
	}
	int age;
	
	String name;
	
	String country;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}