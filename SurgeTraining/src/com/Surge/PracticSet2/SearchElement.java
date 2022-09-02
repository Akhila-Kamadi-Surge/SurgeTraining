package com.Surge.PracticSet2;
//Java program to search an element from an ArrayList

import java.util.ArrayList;

public class SearchElement {
	static boolean search(ArrayList<Integer> arr, int elem) {
		return arr.contains(elem);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(10);
		arr.add(100);
		arr.add(1000);
		arr.add(10000);
		arr.add(3, 50);
		int B = 90;
		System.out.println(search(arr, B));//false
	}

}
