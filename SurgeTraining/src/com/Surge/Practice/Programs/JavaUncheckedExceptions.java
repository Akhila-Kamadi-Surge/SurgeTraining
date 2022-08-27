package com.Surge.Practice.Programs;

/*
 *  Java Program to Handle the Unchecked Exceptions
 *  JAVA Program to Handle Divide by Zero and Multiple Exceptions
 */
public class JavaUncheckedExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,3,4,5};
		
		try {
			A[A.length] = 5/0;
			System.out.println(A[A.length]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			System.out.println("Done...");
		}
	}

}
