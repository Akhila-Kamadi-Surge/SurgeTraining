package com.Surge.PracticSet2;

import java.util.ArrayList;

public class RemoveAllElems {

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
		
		//Method1
		arr.removeAll(arr);
		printList(arr);
		
		//Method2
		arr.clear();
		printList(arr);
	}

}
