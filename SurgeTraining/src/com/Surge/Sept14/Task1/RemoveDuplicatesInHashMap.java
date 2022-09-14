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
		
		HashMap<Integer,String> ans = new HashMap<>();
		for(int i = 1; i <= map.size(); i++) {
			if(!ans.containsValue(map.get(i))) {
				ans.put(i, map.get(i));
			}
		}
		System.out.println(ans);
		
//		============================
//		Using reverse Hashmap
		
//		HashMap<String, Integer> ansMap = new HashMap<>();
//		for(int i = 1; i <= map.size(); i++) {
//			String company = map.get(i);
//			if(!ansMap.containsKey(company)) {
//				ansMap.put(company, i);
//			}
//		}
//		System.out.println(ansMap);
	}

}
