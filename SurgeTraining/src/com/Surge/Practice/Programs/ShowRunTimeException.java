package com.Surge.Practice.Programs;

/*
 * Java Program to Show Runtime exceptions
 */
public class ShowRunTimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,2,3,4,5};
		//throws exception at run time and gets terminated
		System.out.println(A[-1]);//ArrayIndexOutOfBoundsException
		/*
		 * Error: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 6
			at com.Surge.Practice.Programs.ShowRunTimeException.main(ShowRunTimeException.java:8)
		*/
		System.out.println(A[A.length]);//This is not executed as code terminates at line 9
		
		//==============
		int x = 0, y = 5;
		System.out.println(y/x);//ArithmeticException
		
		//===============
		String s = "Akhila";
		int i = Integer.parseInt(s);//NumberFormatException

	}

}
