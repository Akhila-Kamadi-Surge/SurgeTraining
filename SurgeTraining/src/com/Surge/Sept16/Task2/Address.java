package com.Surge.Sept16.Task2;

import java.util.List;

class Address{
	private String houseNo, street, city, state;
	private int pincode;
	private List<Documents> listOfDocs;
	
	public String getHouseNo() {
		return this.houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public List<Documents> getListOfDocs() {
		return listOfDocs;
	}
	public void setListOfDocs(List<Documents> listOfDocs) {
		this.listOfDocs = listOfDocs;
	}
	
}
