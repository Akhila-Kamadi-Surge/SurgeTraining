package com.Surge.Sept6;

import java.util.Arrays;
import java.util.HashMap;


//How to check if two given string is anagram for each other?
public class CheckAnagram {
	static boolean checkAnagram(String str1, String str2) {
		if(str1.length() != str2.length()){
			return false;
		}
		char[] ch1 = str1.toLowerCase().toCharArray(), ch2 = str2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2)) {
			return true;
		}
		return false;
	}
	static boolean checkAnagramUsingHashMap(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if(str1.length() != str2.length()){
			return false;
		}
		HashMap<Character,Integer> hm1 = new HashMap<Character, Integer>();
		HashMap<Character,Integer> hm2 = new HashMap<Character, Integer>();
		for(int i = 0; i < str1.length(); i++) {
			if(hm1.containsKey(str1.charAt(i))) {
				hm1.put(str1.charAt(i), hm1.get(str1.charAt(i))+1);
			}
			else {
				hm1.put(str1.charAt(i), 1);
			}
			if(hm2.containsKey(str2.charAt(i))) {
				hm2.put(str2.charAt(i), hm2.get(str2.charAt(i))+1);
			}
			else {
				hm2.put(str2.charAt(i), 1);
			}
		}
		for(int i = 0; i < str1.length(); i++) {
			if(hm1.containsKey(str2.charAt(i))) {
				int freq1 = hm1.get(str1.charAt(i));
				int freq2 = hm2.get(str1.charAt(i));
				if(freq1 != freq2) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Army";
		String str2 = "Mary";
		if(checkAnagram(str1, str2)) {
			System.out.println("Given strings are anagram to each other");
		}
		else {
			System.out.println("Given strings are not anagrams");
		}
		
		if(checkAnagramUsingHashMap(str1, str2)) {
			System.out.println("Given strings are anagram to each other");
		}
		else {
			System.out.println("Given strings are not anagrams");
		}
	}

}
