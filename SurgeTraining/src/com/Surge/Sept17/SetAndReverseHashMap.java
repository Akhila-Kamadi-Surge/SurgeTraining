package com.Surge.Sept17;

import java.util.HashMap;
import java.util.Map.Entry;

class Employee {
	private int employeeId, employeeSalary;
	public int getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
}
class SetAndReverseHashMap {
	static HashMap<Integer, Integer> setHashMap(Employee emp){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		emp.setEmployeeId(1001);
		emp.setEmployeeSalary(10000);
		map.put(emp.getEmployeeId(), emp.getEmployeeSalary());
		emp.setEmployeeId(1002);
		emp.setEmployeeSalary(20000);
		map.put(emp.getEmployeeId(), emp.getEmployeeSalary());
		emp.setEmployeeId(1003);
		emp.setEmployeeSalary(30000);
		map.put(emp.getEmployeeId(), emp.getEmployeeSalary());
		emp.setEmployeeId(1004);
		emp.setEmployeeSalary(40000);
		map.put(emp.getEmployeeId(), emp.getEmployeeSalary());
		return map;
	}
	
	static HashMap<Integer,Integer> reverseHashMap(HashMap<Integer, Integer> map,Employee emp){
		map = setHashMap(emp);
		HashMap<Integer,Integer> revMap = new HashMap<Integer, Integer>();
		for(Entry<Integer,Integer> entry : map.entrySet()) {
			revMap.put(entry.getValue(), entry.getKey());
		}
		return revMap;
	}
	public static void main(String[] args) {
		Employee emp = new Employee();
//		System.out.println(setHashMap(emp));
//		System.out.println(reverseHashMap(setHashMap(emp), emp));
		HashMap<Integer,Integer> revMap = reverseHashMap(setHashMap(emp), emp);
		for(Entry<Integer,Integer> entry : revMap.entrySet() ) {
			System.out.println("Salary : "+entry.getKey()+", Employee ID : "+entry.getValue());
		}
	}
}
