package com.Surge.PracticSet_HashMap;

import java.util.HashMap;

public class Problem5_CheckKeyValueExist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Double> map = new HashMap<Integer, Double>();
		map.put(1, 1.1);
		map.put(2, 2.2);
		map.put(3, 3.3);
		map.put(4, 4.4);
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue(3.3));
	}

}
