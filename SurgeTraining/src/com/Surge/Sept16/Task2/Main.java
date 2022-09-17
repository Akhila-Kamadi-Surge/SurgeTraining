package com.Surge.Sept16.Task2;

import java.util.ArrayList;
import java.util.List;

class Main{
	
	static Employee parentMethod() {
		Employee emp = new Employee();
		emp.setId("STS179");
		emp.setEmail("STS179@surgetechinc.in");
		emp.setName("Akhila Kamadi");
		emp.setPhone(9876543210l);
		
		Address ad = new Address();
		ad.setHouseNo("7-90/65");
		ad.setStreet(" 5, Miyapur");
		ad.setCity("Hyderabad");
		ad.setState("Telangana");
		ad.setPincode(500780);
		
		emp.setAddress(ad);
		
		List<Documents> listOfDocuments = new ArrayList<Documents>();
		
		Documents docs1 = new Documents();
		docs1.setDocumentName("Aadhar No");
		docs1.setDocumentID("1234 5678 9101");
		listOfDocuments.add(docs1);
		
		Documents docs2 = new Documents();
		docs2.setDocumentName("Pan No");
		docs2.setDocumentID("HYFKP7654L");
		listOfDocuments.add(docs2);
		
		Documents docs3 = new Documents();
		docs3.setDocumentName("Passport");
		docs3.setDocumentID("XYZ12355Y");
		listOfDocuments.add(docs3);
		
		ad.setListOfDocs(listOfDocuments);
		
		return emp;
	}
	
	public static void main(String[] args) {

		System.out.println("Employee Details : ");
		System.out.println("Employee ID : "+parentMethod().getId());
		System.out.println("Name : "+parentMethod().getName());
		System.out.println("Email : "+parentMethod().getEmail());
		System.out.println("Phone Number : "+parentMethod().getPhone());
		
		Address ad = parentMethod().getAddress();
		System.out.println("Address:");
		System.out.println("House No : "+ad.getHouseNo());
		System.out.println("Street Name : "+ad.getStreet());
		System.out.println("City : "+ad.getCity());
		System.out.println("State : "+ad.getState());
		System.out.println("Pin code : "+ad.getPincode());
		
		List<Documents> docs = ad.getListOfDocs();
		System.out.println("List of Mandatory Document Details :");
		for(int i = 0; i < docs.size(); i++) {
			System.out.println(docs.get(i).getDocumentName()+" : "+docs.get(i).getDocumentID());
		}
		
		
	}
}
