package com.Surge.Sept7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

//	Please do hands on each and every small method of all classes
public class ListSetMap {
	
	public static void main(String[] args) {

		//ArrayList
		System.out.println("=============ArrayList=============\n");
		ArrayList<String> name = new ArrayList<String>();
		name.add("Akhila");
		name.add("Kamadi");
		name.add(0, "Ajhila");
		name.set(0, "Akhila");
		name.add(null);
		System.out.println(name.get(3));
		System.out.println(name);
		for(String i : name) {
			System.out.print(i + " ");
		}
		
		//HashSet
		System.out.println("=============HashSet=============\n");
		HashSet<String> nameSet = new HashSet<String>();
		nameSet.add("Akhila");
		nameSet.add("Kamadi");
		nameSet.add(null);
		
		System.out.println(nameSet.contains("Akhila"));
		System.out.println(nameSet);
		
		//HashMap
		System.out.println("=================HashMap=============\n");
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Kamadi");
	    map.put(2, "Akhila");
	    map.put(3, "Akhila");
	    map.put(4, "Alekhya");
	    map.put(null, "AK");
	    map.put(null, null);
	    map.put(3, null);
	    map.put(5, null);
	    System.out.println(map);
	    
	    for(Entry<Integer, String> entry : map.entrySet()) {
	    	System.out.println(entry.getKey() +" = "+entry.getValue());
	    }
	}

}
