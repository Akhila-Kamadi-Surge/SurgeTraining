package com.Surge.Sept14.Task1;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapValueCount {

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
		
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		for (Entry<Integer, String> entry : map.entrySet()) {
//			Integer key = entry.getKey();
			String val = entry.getValue();
			
			if(map2.containsKey(val)) {
				int freq = map2.get(val);
				map2.put(val, freq+1);
			}
			else {
				map2.put(val, 1);
			}
		}
		
		System.out.println(map2);
	}
}
