package com.Surge.Sept2;

import java.util.ArrayList;
import java.util.HashSet;
//Hp, Lenovo, Compaq, Zensar , Dell, Apple, Lenovo ----- > is the list of some strings. 
//Write a program, which will return maximum length string.

public class LargestLengthString {
	static HashSet<String> largeString(ArrayList<String> arrList) {
		int n = arrList.size();
		int len = 0;
		for(int i = 0; i <n; i++){
			if(len < arrList.get(i).length()) {
				len = arrList.get(i).length();
			}
		}
		HashSet<String> hs = new HashSet<String>();
		for(int i = 0; i < n; i++) {
			if(len == arrList.get(i).length()) {
				hs.add(arrList.get(i));
			}
		}
		return hs;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("HP");
		list.add("Lenovo");
		list.add("Compaq");
		list.add("Zensar");
		list.add("Dell");
		list.add("Apple");
		list.add("Lenovo");
		HashSet<String> ans = largeString(list);
		System.out.println(ans);
	}

}
