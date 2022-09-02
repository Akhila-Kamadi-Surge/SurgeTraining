package com.Surge.PracticSet2;

import java.util.ArrayList;
import java.util.Arrays;
//Java program to multiply corresponding elements of two lists

public class Multiply2ArrayLists {
	static ArrayList<Integer> multiplyElems(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
		int n = arr1.size();
		for(int i = 0 ; i < n;i++) {
			arr1.set(i, arr1.get(i)*arr2.get(i));
		}
		return arr1;
	}
	static void printList(ArrayList<Integer> arrList){
		for(int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i)+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(6);
		arr2.add(7);
		arr2.add(8);
		arr2.add(9);
		arr2.add(10);
		
		printList(multiplyElems(arr1, arr2));//6 14 24 36 50 
	}

}
