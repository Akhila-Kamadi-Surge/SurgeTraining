package com.Surge.Sep1;

import java.util.ArrayList;

public class ArrayListClass {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(2, 7);
		list1.remove(5);
		list1.set(2, 4);
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i)+" ");
		}
		
		System.out.println();
		System.out.println(list1.contains(9));;
		System.out.println();
		
		ArrayList list2 = new ArrayList();
		list2.add("Akhila");
		list2.add(10);
		list2.add(11.9);
		list2.add('k');
		System.out.println(list2);
	}
}
