package com.Surge.Sep8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

//write a pogram to iterate hashmap element using iterator?

public class IterateHmUsingIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("A", 1);
		hm.put("B", 2);
		hm.put("C", 3);
		hm.put("D", 4);
		hm.put("E", 5);
		
		Iterator<Entry<String, Integer>> itr = hm.entrySet().iterator();
		
		while (itr.hasNext()) {
			Entry<String, Integer> entry = itr.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
