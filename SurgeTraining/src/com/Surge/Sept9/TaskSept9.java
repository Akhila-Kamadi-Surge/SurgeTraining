package com.Surge.Sept9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

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
}
public class TaskSept9 {
	static List<EmployeeData> getEmployeeList(){
		List<EmployeeData> list = new ArrayList<EmployeeData>();
		
		EmployeeData e1 = new EmployeeData();
		e1.setEmployeeId(101);
		e1.setEmployeeName("Akhila");
		list.add(e1);
		
		EmployeeData e2 = new EmployeeData();
		e2.setEmployeeId(102);
		e2.setEmployeeName("Kamadi"); 
		list.add(e2);
		
		EmployeeData e3 = new EmployeeData();
		e3.setEmployeeId(103);
		e3.setEmployeeName("AK");
		list.add(e3);
		
		return list;
	}
	
	static HashMap<Integer, EmployeeData> getEmployeeMap(List<EmployeeData> list){
		HashMap<Integer, EmployeeData> map = new HashMap<Integer, EmployeeData>();
		for(int i = 0; i < list.size(); i++) {
			map.put(i+1, list.get(i));
		}
		return map;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, EmployeeData> employeeMap = getEmployeeMap(getEmployeeList());
		
		for(Entry<Integer, EmployeeData> entry : employeeMap.entrySet()) {
			System.out.println(entry.getKey()+". "+
					"Employee ID : "+entry.getValue().getEmployeeId() +", "+
					"Employee Name : "+entry.getValue().getEmployeeName());
		}
		
		/*
		 * Output:
		 1. Employee ID : 101, Employee Name : Akhila
		 2. Employee ID : 102, Employee Name : Kamadi
		 3. Employee ID : 103, Employee Name : AK

		 */
	}

}
