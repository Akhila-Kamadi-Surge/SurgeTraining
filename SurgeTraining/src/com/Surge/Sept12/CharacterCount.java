package com.Surge.Sept12;

import java.util.HashMap;
import java.util.Map.Entry;

/*
	How to get distinct characters and their count in a String?
	
	Input
	======
	abc
	abcab3
	hi there, i am pankaj
	
	output
	==========
	{a=1, b=1, c=1}
	{a=2, b=2, c=2}
*/
public class CharacterCount {
	static HashMap<Character, Integer> charCount(String s){
		s = s.replaceAll("[^a-zA-z0-9]", "");//removes all non-alphanumeric characters
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i = 0; i < s.length(); i++) {
			if(hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			}
			else {
				hm.put(s.charAt(i), 1);
			}
		}
		return hm;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hi there, i am pankaj";
		
		HashMap<Character, Integer> map = charCount(str);
		
		for(Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
	}

}
