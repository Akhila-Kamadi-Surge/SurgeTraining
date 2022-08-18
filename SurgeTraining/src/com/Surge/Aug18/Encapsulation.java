package com.Surge.Aug18;

class Employee{
	private String name;
	private int id;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	void print() {
		System.out.println("The new employee's name is "+getName());
		System.out.println("The new employee's id is "+getId());
		System.out.println("The new employee's age is "+getAge());
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println("Before assigning values, default values are given to the data variables");
		emp.print();
		emp.setId(10);
		emp.setName("Akhila");
		emp.setAge(25);
		System.out.println("After setting values...");
		emp.print();
	}
}
