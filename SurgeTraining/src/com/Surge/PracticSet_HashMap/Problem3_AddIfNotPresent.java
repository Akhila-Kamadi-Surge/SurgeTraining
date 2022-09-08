package com.Surge.PracticSet_HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class Problem3_AddIfNotPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THREE", 3);
		map.put("FOUR",4);
		map.put("FIVE", 5);
		map.putIfAbsent("ONE", 111);
		map.putIfAbsent("SIX", 6);
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
