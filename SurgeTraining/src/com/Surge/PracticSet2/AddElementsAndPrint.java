package com.Surge.PracticSet2;

import java.util.ArrayList;

//Java program to create an ArrayList, add elements and print

public class AddElementsAndPrint {
	static void printList(ArrayList<Integer> arrList){
		for(int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(10);
		arr.add(100);
		arr.add(1000);
		arr.add(10000);
		printList(arr);
	}

}
