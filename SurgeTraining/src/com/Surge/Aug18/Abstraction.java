package com.Surge.Aug18;
abstract class Abstract{
	// for fields only; => public, protected, private, static, final, transient & volatile are permitted
	final int side;
	Abstract(int side){
		this.side = side;
	}
	abstract int area();
//	abstract final void print();//error:The abstract method print in type Abstract can only set a visibility modifier, 
//	one of public or protected ==> All methods in it should be either public or protected
//	public final void show();//error:This method requires a body instead of a semicolon
	abstract public void print();
	public final void Greeting() {
		System.out.println("Hello...");
	}
}
class Concrete extends Abstract{
	Concrete(){
		super(9);
		System.out.println("This is a concrete class");
	}
	@Override
	int area() {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("The area of square in Concrete class is "+ area());
	}
	
	void Greet() {
		System.out.println("Good Afternoon...");
	}
	
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concrete conObj = new Concrete();
		conObj.print();
		conObj.Greeting();
		conObj.Greet();
		
		Abstract absObj = new Concrete();
		int area = absObj.area();
		System.out.println("The area of abstract class object is "+ area);
		absObj.print();
		absObj.Greeting();
//		absObj.Greet();//error:The method Greet() is undefined for the type Abstract
	}
}
