package com.Surge.PracticSet_HashMap;

import java.util.HashMap;

public class Problem4_RetrieveValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THREE", 3);
		map.put("FOUR",4);
		System.out.println(map.get("FIVE"));//o/p : null
		System.out.println(map.get("TWO"));//2
	}

}
