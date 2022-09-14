package com.Surge.Sept14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class EmployeeList{
	List<EmployeeData> getMaleEmployeeList(){
		List<EmployeeData> list = new ArrayList<EmployeeData>();
		
		EmployeeData e1 = new EmployeeData();
		e1.setEmployeeId(101);
		e1.setEmployeeName("Akhil");
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
	List<EmployeeData> getFemaleEmployeeList(){
		List<EmployeeData> list = new ArrayList<EmployeeData>();
		
		EmployeeData e1 = new EmployeeData();
		e1.setEmployeeId(104);
		e1.setEmployeeName("Akhila");
		list.add(e1);
		
		EmployeeData e2 = new EmployeeData();
		e2.setEmployeeId(105);
		e2.setEmployeeName("Kamadi"); 
		list.add(e2);
		
		EmployeeData e3 = new EmployeeData();
		e3.setEmployeeId(106);
		e3.setEmployeeName("AK");
		list.add(e3);
		
		return list;
	}
	
	HashMap<Integer,String> listCompare(List<EmployeeData> list1, List<EmployeeData> list2){
		list1 = getMaleEmployeeList();
		list2 = getFemaleEmployeeList();
		HashMap<Integer,String> ans = new HashMap<Integer, String>();
		for(int i = 0; i < list1.size(); i++) {
			for(int j = 0; j < list2.size(); j++) {
				if(list1.get(i).getEmployeeName().equals( list2.get(j).getEmployeeName())) {
					ans.put(list1.get(i).getEmployeeId(), list1.get(i).getEmployeeName());
					break;
				}
			}
		}
		return ans;
	}
}
