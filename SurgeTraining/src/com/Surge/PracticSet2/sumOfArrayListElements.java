package com.Surge.PracticSet2;

import java.util.ArrayList;


public class sumOfArrayListElements {
	static int sum(ArrayList<Integer> arr) {
		int len = arr.size();
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum += arr.get(i);
		}
		return sum;
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
		System.out.println(sum(arr));
	}

}
