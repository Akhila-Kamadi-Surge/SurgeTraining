package com.Surge.PracticSet2;

import java.util.ArrayList;

//Java program to remove elements from specific index from an ArrayList
public class RemoveElement {
	
	static void printList(ArrayList<Integer> arrList){
		for(int i = 0; i < arrList.size(); i++) {
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
		arr.add(3, 50);
		arr.remove(2); 
		
		printList(arr);
		
		/*
		 O/p: 1 10 50 1000 10000 
		 
		 */
	}

}
