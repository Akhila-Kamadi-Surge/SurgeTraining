package com.Surge.Aug24;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class SurgeException extends Exception{
	public SurgeException() {
		System.out.println("in default constructor");
	}
	public SurgeException(String errMsg) {
		super(errMsg);
	}
}
public class CustomExceptionClass {
	static String strAge;
	static int num1 = 5;
	static int num2;
	public static void main(String[] args) throws Exception{
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			
			System.out.println("input number is : ");
			strAge = br.readLine();
			try {
				if (Integer.parseInt(strAge) <= 0) {
					throw new SurgeException("Age should not be less than ZERO");
				}
				else {
					System.out.println("Valid age");
				}
			}
			catch (SurgeException e) {
				// TODO: handle exception
				System.out.println("In custom catch block..");
				System.out.println(e.getMessage());
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("In general catch block");
				e.printStackTrace();
			}
			finally {
				System.out.println("in the final block... after exception");
			}
		}
	}
	
}
