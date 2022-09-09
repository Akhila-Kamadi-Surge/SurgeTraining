package com.Surge.Sept9;

import java.util.HashMap;

class EmployeeData{
	private int employeeId;
	private String employeeName;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	HashMap<Integer, String> listOfEmployees(int id, String name){
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(id, name);
		return map;
	}
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeData emp1 = new EmployeeData();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		emp1.setEmployeeId(1);
		emp1.setEmployeeName("Akhila");
		
		map.putAll(emp1.listOfEmployees(emp1.getEmployeeId(), emp1.getEmployeeName()));
		
		emp1.setEmployeeId(2);
		emp1.setEmployeeName("Kamadi");
		
		map.putAll(emp1.listOfEmployees(emp1.getEmployeeId(), emp1.getEmployeeName()));
		
		
		emp1.setEmployeeId(3);
		emp1.setEmployeeName("AK");
		
		map.putAll(emp1.listOfEmployees(emp1.getEmployeeId(), emp1.getEmployeeName()));
		
		System.out.println(map);
		
	}

}
