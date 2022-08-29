package com.Surge.Aug29;

import java.io.Serializable;

class Employee implements Serializable{
	
	private static final long serialVersionUID = 12324L;
	private String name;
	private String address;
	private String empId;
	private int age;
	transient int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, String address, String empId, int age, int salary) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.address = address;
		this.empId = empId;
		this.age = age;
		this.salary = salary;
	}
}

class EmployeeChild extends Employee{
	private static final long serialVersionUID = -1868154258371393027L;
	private String companyName;
	private String companyAddress;
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public EmployeeChild(String name, String address, String empId, int age, int salary,String companyName, String companyAddress) {
		super(name, address, empId, age, salary);
		// TODO Auto-generated constructor stub
		this.setCompanyName(companyName);
		this.setCompanyAddress(companyAddress);
	}
}
