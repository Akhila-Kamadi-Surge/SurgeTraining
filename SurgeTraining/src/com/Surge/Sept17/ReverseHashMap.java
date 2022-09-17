package com.Surge.Sept17;

import java.util.HashMap;
import java.util.Map.Entry;

public class ReverseHashMap {
	static HashMap<Integer, Double> setHashMap(){
		HashMap<Integer, Double> map = new HashMap<Integer, Double>();
		map.put(1001, 10000.0);
		map.put(1002, 20000.0);
		map.put(1003, 30000.0);
		map.put(1004, 40000.0);
		return map;
	}
	
	static HashMap<Double,Integer> reverseHashMap(HashMap<Integer, Double> map){
		map = setHashMap();
		HashMap<Double,Integer> revMap = new HashMap<Double, Integer>();
		for(Entry<Integer,Double> entry : map.entrySet()) {
			revMap.put(entry.getValue(), entry.getKey());
		}
		return revMap;
	}
	public static void main(String[] args) {
		HashMap<Double,Integer> revMap = reverseHashMap(setHashMap());
		for(Entry<Double,Integer> entry : revMap.entrySet() ) {
			System.out.println("Salary : "+entry.getKey()+", Employee ID : "+entry.getValue());
		}
	}
}
