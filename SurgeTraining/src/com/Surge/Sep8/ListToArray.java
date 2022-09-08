package com.Surge.Sep8;

//write a program to convert list to Array?

import java.util.ArrayList;

public class ListToArray {
	static int[] listToArr(ArrayList<Integer> list) {
		int len = list.size();
		int[] arr = new int[len];
		for(int i = 0; i < len ; i++) {
			arr[i] = list.get(i);
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("List :"+list);
		
		//Method 1 => Object array
		Object[] arr = list.toArray();
		System.out.println("Object array : ");
		for(Object i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("array list to int[] : ");
		//Method 2
		int[] array = listToArr(list);
		for(int i : array) {
			System.out.print(i + " ");
		}
	}

}
