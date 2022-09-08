package com.Surge.PracticSet_HashMap;


import java.util.Collection;
import java.util.HashMap;

public class Problem9_RetrieveAllValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "AAAA");
		map.put(2, "BBBB");
		map.put(3, "CCCC");
		map.put(4, "DDDD");
		map.put(5, "EEEE");
//		Collection<String> values = map.values();
		for (String value: map.values()) {
			System.out.println(value);
		}
	}

}
