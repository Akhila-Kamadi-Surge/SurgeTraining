package com.Surge.Sept2;

import java.util.ArrayList;

public class practiceQues1 {
	static int multiply(ArrayList<Integer> arrList) {
		int ans = 1;
		for(int i = 0; i < arrList.size(); i++) {
			ans *= arrList.get(i);
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
//		list.add(6);
//		list.add(7);
//		list.add(8);
//		list.add(9);
//		list.add(10);
		
		System.out.println(multiply(list));
		
		int sum = 0;//1+2+3+4+5 = 15
		for(int i = 1; i <= 5; i++) {
			sum += i;
		}
		System.err.println(sum);
	}

}
