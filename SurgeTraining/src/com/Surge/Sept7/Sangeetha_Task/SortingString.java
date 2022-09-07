package com.Surge.Sept7.Sangeetha_Task;

import java.util.ArrayList;
import java.util.Collections;

//write a program ascending and descending order for using list of string?
//{"apple","mango","orange","Guava"}
public class SortingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("orange");
		fruits.add("guava");
//		Collections.sort(fruits);
//		System.out.println(fruits);
		
		Collections.sort(fruits,(a,b)->{
			return b.compareTo(a);
		});
		System.out.println(fruits);
	}

}
