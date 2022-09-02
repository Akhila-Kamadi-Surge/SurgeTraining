package com.Surge.PracticSet2;


import java.util.ArrayList;

//Java program to find index of an element from an ArrayList

public class AtWhichIndex {
	static int findIndex(ArrayList<Integer> arr,int B) {
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i) == B) {
				return i;
			}
		}
		return -1;
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
		int C = 10;
		//If element present it prints index else it prints -1
		System.out.println(findIndex(arr, B));//-1
		System.out.println(findIndex(arr, C));//1
	}

}
