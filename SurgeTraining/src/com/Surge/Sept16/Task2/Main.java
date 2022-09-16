package com.Surge.Sept16.Task2;

import java.util.HashMap;
import java.util.Map.Entry;

class Employee {
	private String id, name,email;
	private long phone;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
//	Address address;
	
	class Address{
		private String houseNo, street, city, state;
		private int pinode;
		
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
		public int getPinode() {
			return pinode;
		}
		public void setPinode(int pinode) {
			this.pinode = pinode;
		}
		
//		Documents docs;
		
		class Documents{
			private HashMap<String,String> listOfDocuments;
			
			public HashMap<String,String> getListOfDocuments(){
				return this.listOfDocuments;
			}
			public void setListOfDocuments(HashMap<String,String> listOfDocuments) {
				this.listOfDocuments = listOfDocuments;
			}
		}
	}
}
class Main{
	public static <Documents> void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setId("STS179");
		emp.setEmail("STS179@surgetechinc.in");
		emp.setName("Akhila Kamadi");
		emp.setPhone(9876543210l);
		
		Employee.Address ad = emp.new Address();
		ad.setHouseNo("7-90/65");
		ad.setStreet("Miyapur");
		ad.setCity("Hyderabad");
		ad.setState("Telangana");
		ad.setPinode(500780);
		
		Employee.Address.Documents docs = ad.new Documents();
		HashMap<String,String> listOfDocuments = new HashMap<String,String>();
		listOfDocuments.put("Aadhar Number", "1234 5678 9101");
		listOfDocuments.put("Pan Card Number", "HYFKP7654L");
		listOfDocuments.put("Image", "Photo.jpg");
		docs.setListOfDocuments(listOfDocuments);
		
		System.out.println("Name : "+emp.getName());
		System.out.println("Employee ID : "+emp.getId());
		System.out.println("Phone Number : "+emp.getPhone());
		System.out.println("Email ID : "+emp.getEmail());
		
		System.out.println("House No : "+ad.getHouseNo());
		System.out.println("Street Name : "+ad.getStreet());
		System.out.println("City : "+ad.getCity());
		System.out.println("State : "+ad.getState());
		System.out.println("Pincode : "+ad.getPinode());
		
		for(Entry<String, String> entry : listOfDocuments.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}
}
