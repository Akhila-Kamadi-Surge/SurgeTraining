package com.Surge.Aug29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationAndDeserialization {
	static void serialize(Employee emp,EmployeeChild empChild) {
		try {
			//Serialization process
			FileOutputStream fileOut = new FileOutputStream("Akhila.txt");
			FileOutputStream childFileOut = new FileOutputStream("AkhilaKamadi.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			ObjectOutputStream out2 = new ObjectOutputStream(childFileOut);
			//Serialization
			out.writeObject(emp);
			out2.writeObject(empChild);
			out.flush();
			out.close();
			out2.flush();
			out2.close();
			fileOut.close();
			childFileOut.close();
			System.out.println("Serialization completed");
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	static void deserialize(Employee emp,EmployeeChild empChild) {
		Employee deserializedEmployee;
		EmployeeChild deserializedEmpChild;
		try {
			//Deserialization process
			FileInputStream fileIn = new FileInputStream("Akhila.txt");
			FileInputStream childFileIn = new FileInputStream("AkhilaKamadi.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			ObjectInputStream childIn = new ObjectInputStream(childFileIn);
			//Deserialization 
			deserializedEmployee =  (Employee) in.readObject();
			deserializedEmpChild = (EmployeeChild) childIn.readObject();
			in.close();
			fileIn.close();
			childIn.close();
			childFileIn.close();
			
			System.out.println("Deserialized employe...");
			System.out.println("Name : "+deserializedEmployee.getName());
			System.out.println("Employee ID : "+deserializedEmployee.getEmpId());
			System.out.println("Address : "+deserializedEmployee.getAddress());
			System.out.println("Salary : "+deserializedEmployee.getSalary());
//			System.out.println("Salary : "+deserializedEmployee.salary);//trasient
			System.out.println();
			
			System.out.println("Sub class Name : "+deserializedEmpChild.getName());
			System.out.println("Sub class Employee ID : "+deserializedEmpChild.getEmpId());
			System.out.println("Sub class Address : "+deserializedEmpChild.getAddress());
			System.out.println("Sub class Salary : "+deserializedEmpChild.getSalary());
			System.out.println("Sub class Company Name : "+deserializedEmpChild.getCompanyName());
			System.out.println("Sub class Company Address : "+deserializedEmpChild.getCompanyAddress());
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Akhila", "Hyd", "STS179", 25, 10000);
//		serialize(emp);
//		deserialize(emp);
		//Child class object
		EmployeeChild empChild = new EmployeeChild("AkhilaKamadi", "Hyderabad", "STS179@surgetechinc.in", 25, 15000, "Surge Technology", "Chennai");
		serialize(emp,empChild);
		deserialize(emp,empChild);
	}

}
