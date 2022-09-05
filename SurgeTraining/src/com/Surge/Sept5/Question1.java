package com.Surge.Sept5;

import java.util.ArrayList;

//Write a java program to store integer number in array list and print even numbers from it.

public class Question1 {
	
	static void printEvenElements(ArrayList<Integer> arrList) {
		int len = arrList.size();
		for(int i = 0; i < len; i++) {
			if(arrList.get(i)%2 == 0) {
				System.out.print(arrList.get(i)+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(10);
		arrList.add(62);
		arrList.add(73);
		arrList.add(45);
		arrList.add(108);
		
		printEvenElements(arrList);
	}

}
