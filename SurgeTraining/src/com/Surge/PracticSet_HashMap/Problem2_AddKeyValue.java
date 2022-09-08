package com.Surge.PracticSet_HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Problem2_AddKeyValue {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THREE", 3);
		map.put("FOUR",4);
		map.put("FIVE", 5);
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		System.out.println("-------------------------------");
		HashMap<String, Integer> anotherMap = new HashMap<>();
		map.put("SIX", 6);
		map.put("SEVEN", 7);
		//Inserting key-value pairs of map to anotherMap using putAll() method
		anotherMap.putAll(map);
		entrySet = anotherMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}
