package com.Surge.PracticSet2;
//Java program to add element at specific index in ArrayList

import java.util.ArrayList;

public class AddElemAtIndex {

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
		printList(arr);
		
		/* O/p: 1 10 100 50 1000 10000 
		 
		 		index -> value
				 0 ->     1
				 1 ->     10
				 2 ->     100
				 3 ->     50
				 4 ->     1000
				 5 ->     10000
		 */
	}

}
