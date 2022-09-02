package com.Surge.PracticSet2;
//Java program to replace element within the ArrayList

import java.util.ArrayList;

public class ReplaceArrayListElement {
	static ArrayList<Integer> replaceElement(ArrayList<Integer> arr, int index, int val){
		int len = arr.size();
		if(index < 0 || index >= arr.size()) {
			ArrayList<Integer> invalid = new ArrayList<Integer>();
			invalid.add(-1);
			return invalid;
		}
		arr.set(index, val);
		return arr;
	}
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(10);
		arr.add(100);
		arr.add(1000); 
		arr.add(10000);
		arr.add(3, 50);
		int index = 6;
		int val = 90;
		index = 4;
		val = 8;
		System.out.println(replaceElement(arr, index, val));//[1, 10, 100, 50, 8, 10000]
	}
}
