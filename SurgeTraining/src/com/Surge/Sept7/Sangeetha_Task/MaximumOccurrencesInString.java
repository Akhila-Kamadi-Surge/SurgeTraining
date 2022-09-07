package com.Surge.Sept7.Sangeetha_Task;

import java.util.HashMap;
import java.util.Map.Entry;

//How to find the maximum occurring character in a given string?=>Java
public class MaximumOccurrencesInString {
	static char maxOccurred(String str) {
		int len = str.length();
		HashMap<Character,Integer> hm = new HashMap<>();
		for(int i = 0; i < len; i++) {
			if(hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			}
			else{
				hm.put(str.charAt(i), 1);
			}
		}
		int max = Integer.MIN_VALUE;
		char ans = 0;
		for(Entry<Character, Integer> entry : hm.entrySet()) {
			if(entry.getValue()>max) {
				max = entry.getValue();
				ans = entry.getKey();
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str =  "Java";
		System.out.println(maxOccurred(str));
	}

}
