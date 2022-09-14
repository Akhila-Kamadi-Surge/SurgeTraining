package com.Surge.Sept14;

import java.util.HashMap;

public class ListComparison {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		EmployeeData data = new EmployeeData();
		EmployeeList empObj = new EmployeeList();
		HashMap<Integer, String> ans = empObj.listCompare(empObj.getMaleEmployeeList(),empObj.getFemaleEmployeeList());
		System.out.println(ans);
	}
}
