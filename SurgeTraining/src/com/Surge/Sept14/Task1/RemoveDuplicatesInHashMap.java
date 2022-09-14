package com.Surge.Sept14.Task1;

import java.util.HashMap;

public class RemoveDuplicatesInHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "TCS");
		map.put(2, "Wipro");
		map.put(3, "Google");
		map.put(4, "TCS");
		map.put(5, "Google");
		map.put(6, "Google");
		map.put(7, "Google");
		
		HashMap<String, Integer> ansMap = new HashMap<>();
//		for(int i = 0; i < map.size(); i++) {
//			String company = map.get(i+1);
//			if(!ansMap.containsKey(company)) {
//				ansMap.put(company, i+1);
//			}
//			else {
//				ansMap.remove(company);
//			}
//		}
		
		
		
		System.out.println(ansMap);
	}

}
