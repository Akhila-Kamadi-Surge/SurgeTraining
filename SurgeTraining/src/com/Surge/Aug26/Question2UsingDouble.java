package com.Surge.Aug26;

import java.util.Scanner;

interface DoubleArithmeticOperations{
	double intAddition(double number1, double number2);
	double intSubtraction(double number1, double number2);
	double intMultiplication(double number1, double number2);
	double intDivision(double number1, double number2);
}
abstract class DoubleOperations implements DoubleArithmeticOperations{
	public double intAddition(double number1, double number2) {
		return number1+number2;
	}
	public double intSubtraction(double number1, double number2) {
		if(number1>number2) {
			return number1-number2;
		}
		else {
			return number2-number1;
		}
	}
	public double intMultiplication(double number1, double number2) {
		return number1*number2;
	}
	public double intDivision(double number1, double number2) throws ArithmeticException{
		if(number1!=0 && number2!=0) {
			if(number1>number2) {
				return number1/number2;
			}
			else {
				return number2/number1;
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

class ModuliClass extends DoubleOperations{

	@Override
	int Modulus(int number1, int number2) throws ArithmeticException{
		if(number1!=0 && number2!=0) {
			if(number1>number2) {
				return (int)(number1%number2);
			}
			else {
				return (int)(number2%number1);
			}
		}
		else {
			throw new ArithmeticException("Number can't be divided by zero");
		}
	}
	
}
public class Question2UsingDouble {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleOperations doubleObj = new ModuliClass();
		
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
		
		switch(operator) {
		 	case "+" : {
		 		double sum = doubleObj.intAddition(number1, number2);
		 		System.out.println("Addition of two numbers : "+sum);
		 		break;
		 	}
		 	case "-" : {
		 		double difference = doubleObj.intSubtraction(number1, number2);
		 		System.out.println("Subtraction of two numbers : "+difference);
		 		break;
		 	}
		 	case "*" : {
		 		double multiplication = doubleObj.intMultiplication(number1, number2);
		 		System.out.println("Multiplication of two numbers : "+multiplication);
		 		break;
		 	}
		 	case "/" : {
		 		try {
		 			double division = doubleObj.intDivision(number1, number2);
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
		 			doubleObj.setNumber1(intNumber1);
		 			doubleObj.setNumber2(intNumber2);
		 			int modulus = doubleObj.Modulus(doubleObj.getNumber1(), doubleObj.getNumber2());
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
