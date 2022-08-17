package com.Surge.Aug17;


class Calculator // base class, SuperClass, Parent class
{
//	Calculator()
//	{
//		System.out.println("In Constructor of Calculator Class");
//	}
	
	public int Add(int one, int two, int three)
	{
		return (one+two+three);
				
	}
	
}
/*
class Multiplication extends Calculator
{
//	Multiplication()
//	{
//		System.out.println("In constructor of multiplication");
//	}


	public int Add(int one, int two, int three)
	{
		System.out.println("in sub class , Multiplication class, add method");
		return (one+two+three);
				
	}

	public int Multiply(int one, int two, int three)
	{
		return (one*two*three);
				
	}	
	
}
*/
class Division extends Calculator
{
//	Division()
//	{
//		System.out.println("In constructor of Division");
//	}


	public int Add(int one, int two, int three)
	{	
		System.out.println("calling super class Add() method "+super.Add(one+2, two+3, three+4));
		System.out.println("in sub class , Multiplication class, add method");
		return (one+two+three);
				
	}

	public int division(int one, int two, int three)
	{
		return (one/two/three);
				
	}	
	
}

// create a class which accepts an array and calculate the addition of array numbers

class ArrayAddition{
	int sumArr(int[] A) {
		int n = A.length;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += A[i];
		}
		return sum;
	}
}

public class Inheritance 
{

	public static void main(String[] args) 
	{
		
		/*
		Multiplication objMulti = new Multiplication();
		objMulti.Add(9, 9, 9);
		*/
		
		
		// reference of super class and object of sub/ child class
		
//		Calculator objCalc = new Multiplication();
//		objCalc.Add(1, 4, 5);
		// why? As Calculator is object reference and Multiplication is object 
		//The Add() method of Calculator is overridden with Add() method of Multiplication
		// only methods in Super class will work
//		System.out.println(objCalc.Add(1, 1, 1));
		
		// create object of sub class and use method of super class in main method
		// hint is super keyword
		Calculator objCalc = new Division();
		int sum = objCalc.Add(10, 20, 30);
		
		System.out.println("Calling Add() of Divsion class "+sum);
		
//		objCalc.divide();//Gives error as we are using Calculator as reference and calculator doesn't have dividion method in it
		
		Division dvObj = new Division();
		int div = dvObj.division(300, 2, 3);
		System.out.println("Calling division() method of Division class "+div);
		
		//=====================
		ArrayAddition arrSum = new ArrayAddition();
		System.out.println("Sum of Array elements "+arrSum.sumArr(new int[] {1,2,3,4,5}));
		
	}

}
