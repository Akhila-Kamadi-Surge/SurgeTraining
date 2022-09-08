package com.Surge.PracticSet_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Problem_11_RemoveKeyValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<>();
		map.put("ONE", "AAAA");
		map.put("TWO", "BBBB");
		map.put("THREE", "CCCC");
		map.put("FOUR", "DDDD");
		map.put("FIVE", "EEEE");
		System.out.println("Hashmap before remove :");
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		System.out.println("-------------------------------");
//		map.remove("ONE");
		map.remove("1");
		System.out.println("Hashmap after remove :");
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
