package com.Surge.Sep8;

import java.util.ArrayList;
import java.util.HashSet;

//write a program to traverse(or iterate) list and hashset?

public class IterateListHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println("Iterate over Array list");
		for (Integer val : list) {
			System.out.print(val + " ");
		}
		System.out.println();
		System.out.println("------------------------------------------------");
		
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(5);
		set.add(15);
		set.add(20);
		set.add(25);
		
		System.out.println("Iterate over Hash set");
		
		for (Integer val : set) {
			System.out.print(val + " ");
		}
	}

}
