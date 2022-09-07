package com.Surge.Sept7.Sangeetha_Task;

import java.util.ArrayList;
import java.util.HashSet;

//Remove the duplicate element for given list of integer?{6,3,5,6,3,8,1,0,4,2,3,7}
public class RemoveDuplicates {
	static HashSet<Integer> removeDuplicates(ArrayList<Integer> list){
		int len = list.size();
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i = 0; i < len; i++) {
			hs.add(list.get(i));
		}
		return hs;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(6);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(3);
		list.add(8);
		list.add(1);
		list.add(0);
		list.add(4);
		list.add(2);
		list.add(3);
		list.add(7);
		
		System.out.println(removeDuplicates(list));
		
	}

}
