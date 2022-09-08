package com.Surge.PracticSet_HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class Problem_14_ReplaceValueIfValueMappedToKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<>();
		map.put("ONE", "AAAA");
		map.put("TWO", "BBBB");
		map.put("THREE", "CCCC");
		map.put("FOUR", "DDDD");
		map.put("FIVE", "EEEE");
		
		System.out.println("Hashmap before replace :");
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		System.out.println("-------------------------------");
		
		//Replacing the value associated with 'FOUR' to '444' only if it is currently mapped to 'DDD'
		map.replace("FOUR", "DDDD", "4444");
		
		System.out.println("Hashmap after replace :");
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
