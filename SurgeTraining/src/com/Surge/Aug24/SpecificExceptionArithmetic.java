package com.Surge.Aug24;

import java.util.Scanner;

class ArithmeticExceptionClass{
	float division(int num1,int num2) throws ArithmeticException{
		if(num2 == 0) {
			throw new ArithmeticException("Invalid input. Number is not divisible by 0");
		}
		else {
			return (float)num1/num2;
		}
	}
}
public class SpecificExceptionArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
		ArithmeticExceptionClass aec = new ArithmeticExceptionClass();
		try {
			System.out.println(aec.division(num1, num2));;
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("Code executed without abrupt termination");
		}
	}

}
