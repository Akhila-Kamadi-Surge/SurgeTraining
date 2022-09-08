package com.Surge.PracticSet_HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Problem_10_RetrieveAllKeyVaues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<>();
		map.put("ONE", "AAAA");
		map.put("TWO", "BBBB");
		map.put("THREE", "CCCC");
		map.put("FOUR", "DDDD");
		map.put("FIVE", "EEEE");
//		Set<Entry<String, String>> entrySet = map.entrySet();
		for(Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
