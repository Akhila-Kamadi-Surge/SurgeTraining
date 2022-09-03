package com.Surge.PracticSet2;

import java.util.ArrayList;
import java.util.List;

//Java program to create a sub list from an ArrayList
//How to extract some of the elements from given list in java?
public class sublistOfArrayList {
	
	static ArrayList<Integer> subList(ArrayList<Integer> arrList, int s, int e){
		ArrayList<Integer> ansList = new ArrayList<>();
		for(int i = s; i <= e; i++) {
			ansList.add(arrList.get(i));
		}
		return ansList;
	}
	 public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		int start = 2, end = 4;
		
		//Method1
		List<Integer> ansList = list.subList(start, end+1);
		System.out.println(ansList);
		
		//Method2
		System.out.println(subList(list, start, end));
	}
}
