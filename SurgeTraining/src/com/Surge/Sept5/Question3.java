package com.Surge.Sept5;

import java.util.Collections;
import java.util.Vector;

//Write a java program some elements in Vector .And sort the vector and print

public class Question3 {
	static Vector<Integer> sortList(Vector<Integer> vecList){
		int len = vecList.size();
		for(int i = 0; i < len; i++) {
			for(int j = i+1; j < len; j++) {
				if(vecList.get(j) < vecList.get(i)) {
					int temp = vecList.get(j);
					vecList.set(j,vecList.get(i));
					vecList.set(i,temp);
					break;
				}
			}
		}
		return vecList;
	}
	public static void main(String[] args) {
		Vector<Integer> vecList = new Vector<Integer>();
		vecList.add(10);
		vecList.add(2);
		vecList.add(99);
		vecList.add(45);
		vecList.add(0);
		vecList.add(89);
		vecList.add(72);
		vecList.add(65);
		vecList.add(3);
		vecList.add(99);
		
		//Method1
		Collections.sort(vecList);
		
		System.out.println(vecList);
		
		//Method2
		Vector<Integer> ans = sortList(vecList);
		System.out.println("Sorted Vector");
		for(int i =0; i < ans.size(); i++) {
			System.out.print(ans.get(i)+" ");
		}
		
	}

}
