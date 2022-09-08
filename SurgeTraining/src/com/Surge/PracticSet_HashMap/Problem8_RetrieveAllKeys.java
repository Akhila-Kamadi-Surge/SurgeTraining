package com.Surge.PracticSet_HashMap;

import java.util.HashMap;
import java.util.Set;

public class Problem8_RetrieveAllKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "AAAA");
		map.put(2, "BBBB");
		map.put(3, "CCCC");
		map.put(4, "DDDD");
		map.put(5, "EEEE");
//		Set<Integer> keySet = map.keySet();
		for (Integer key: map.keySet()) {
			System.out.println(key);
		}
	}

}
