package com.Surge.Sept16;

import java.util.HashMap;
import java.util.Map.Entry;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Employee> map = new HashMap<Integer, Employee>();
		Employee e1 = new Employee();
		e1.setEmpId(101);
		e1.setEmpName("Akhila.K");
		map.put(1, e1);
		
		Employee e2 = new Employee();
		e2.setEmpId(102);
		e2.setEmpName("Akhila");
		map.put(2, e2);
		System.out.println("-----------------------------------");
		System.out.println("| S.NO |  Employee ID  | Name     |");
		System.out.println("|------|---------------|----------|");
		for(Entry<Integer, Employee> entry : map.entrySet()) {
			int key = entry.getKey();
			Employee val = entry.getValue();
//			System.out.println(key+"| Employee ID : "+val.getEmpId()+"| Employee Name : "+val.getEmpName());
			
			System.out.println("| "+key+ "    |    " +val.getEmpId() + "        | "+val.getEmpName()+"   |");
			
		}
		System.out.println("-----------------------------------");
	}

}
