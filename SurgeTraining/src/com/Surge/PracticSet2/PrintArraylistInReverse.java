package com.Surge.PracticSet2;
//Java program to add elements in ArrayList and print them in reverse order

import java.util.ArrayList;

public class PrintArraylistInReverse {

	static void printList(ArrayList<Integer> arrList){
		for(int i = arrList.size()-1; i >= 0; i--) {
			System.out.print(arrList.get(i)+" ");
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
		
		/*
		 O/p:
		 10000 1000 100 10 1
		 */
	}


}
