package com.Surge.Aug26;

import java.util.Scanner;

/*
-	Write a program which performs Addition, Subtraction, Multiplication,Division and Modulus. 
Make use of Encapsulation, Inheritance, Abstraction , Interfaces and Polymorphism in the same program
*/

interface IntArithmeticOperations{
	int intAddition(double number1, double number2);
	int intSubtraction(double number1, double number2);
	int intMultiplication(double number1, double number2);
	int intDivision(double number1, double number2);
}

abstract class IntegerOperations implements IntArithmeticOperations{
	public int intAddition(double number1, double number2) {
		return (int)(number1+number2);
	}
	public int intSubtraction(double number1, double number2) {
		if(number1>number2) {
			return (int)(number1-number2);
		}
		else {
			return (int)(number2-number1);
		}
	}
	public int intMultiplication(double number1, double number2) {
		return (int)(number1*number2);
	}
	public int intDivision(double number1, double number2) throws ArithmeticException{
		if(number1!=0 && number2!=0) {
			if(number1>number2) {
				return (int)(number1/number2);
			}
			else {
				return (int)(number2/number1);
			}
		}
		else {
			throw new ArithmeticException("Number can't be divided by zero");
		}
	}
	private int number1, number2;
	
	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	abstract int Modulus(int number1, int number2); 
}

class ModulusClass extends IntegerOperations{

	@Override
	int Modulus(int number1,int number2) throws ArithmeticException{
		if(number1!=0 && number2!=0) {
			if(number1>number2) {
				return number1%number2;
			}
			else {
				return number2%number1;
			}
		}
		else {
			throw new ArithmeticException("Number can't be divided by zero");
		}
	}
	
}

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerOperations intObj = new ModulusClass();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give an operator like +,-,*,/,%");
		String operator = sc.next();
		int intNumber1 = 0, intNumber2 = 0;
		double number1 = 0,number2 = 0;
		if(operator.equals("%")) {
			System.out.println("Give 1st number");
			intNumber1 = sc.nextInt();
			System.out.println("Give 2nd number");
			intNumber2 = sc.nextInt();
		}
		else {
			System.out.println("Give 1st number");
			number1 = sc.nextDouble();
			System.out.println("Give 2nd number");
			number2 = sc.nextDouble();
		}
		sc.close();
		
		switch(operator) {
		 	case "+" : {
		 		int sum = intObj.intAddition(number1, number2);
		 		System.out.println("Addition of two numbers : "+sum);
		 		break;
		 	}
		 	case "-" : {
		 		int difference = intObj.intSubtraction(number1, number2);
		 		System.out.println("Subtraction of two numbers : "+difference);
		 		break;
		 	}
		 	case "*" : {
		 		int multiplication = intObj.intMultiplication(number1, number2);
		 		System.out.println("Multiplication of two numbers : "+multiplication);
		 		break;
		 	}
		 	case "/" : {
		 		try {
		 			int division = intObj.intDivision(number1, number2);
		 			System.out.println("Division of two numbers : "+division);
		 			break;
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
		 			System.out.println("Finally executed division of two numbers without abrupt termination.");
		 		}
		 		break;
		 	}
		 	case "%" :{
		 		try {
		 			intObj.setNumber1(intNumber1);
		 			intObj.setNumber2(intNumber2);
		 			int modulus = intObj.Modulus(intObj.getNumber1(), intObj.getNumber2());
		 			System.out.println("Modulo of two numbers : "+modulus);
		 			break;
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
		 			System.out.println("Finally executed modulus of two numbers without abrupt termination.");
		 		}
		 		break;
		 	}
		 	default : {
		 		System.out.println("Invalid operator");
		 	}
		}
		
	}

}
