package com.Surge.Aug18;

class Employee{
	private String name, address;
	private long mobileNo;
	private int age;
	private int pincode;
	
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
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	void print() {
		System.out.println("Name of the employee : "+getName());
		System.out.println("Age of the employee : "+getAge());
		System.out.println("Mobile number of the employee : "+getMobileNo());
		System.out.println("Address of the employee : "+getAddress());
		System.out.println("Pincode of the employee : "+getPincode());
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println("Before assigning values, default values are given to the data variables");
		emp.print();
		
		emp.setName("Akhila");
		emp.setAge(25);
		emp.setMobileNo(1234567890);
		emp.setAddress("Hyderabad");
		emp.setPincode(500050);
		System.out.println();
		System.out.println(".........After setting values.........");
		emp.print();
	}
}
