package com.Surge.Sept6;

import java.util.HashSet;

//how to remove all duplicates from a given string?
public class RemoveStringDuplicates {
	static String removeDuplicate(String str){
		str = str.toLowerCase();
		HashSet<Character> hs = new HashSet<>();
		int n = str.length();
		for(int i = 0; i < n; i++) {
			hs.add(str.charAt(i));
		}
		return hs.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AkhilaKamadi";
		
		System.out.println(removeDuplicate(str));
	}

}
