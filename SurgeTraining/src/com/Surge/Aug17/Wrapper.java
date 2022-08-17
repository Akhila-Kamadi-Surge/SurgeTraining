package com.Surge.Aug17;

public class Wrapper {
	public static void main(String[] args) {
		//============Wrapping================
		int num=50; 

		//Converting int into Integer explicitly
		Integer first=Integer.valueOf(num);

		//Autoboxing
		Integer second=num;
		  
		System.out.println(num);  
		System.out.println(first);
		System.out.println(second);
		
		//=================Unwrapping=================
		Integer num2=new Integer(5);

		//Converting Integer to int explicitly  
		int third=num2.intValue();

		//Unboxing
		int fourth=num2;   
		    
		System.out.println(num2);
		System.out.println(third);
		System.out.println(fourth);
	}
}
