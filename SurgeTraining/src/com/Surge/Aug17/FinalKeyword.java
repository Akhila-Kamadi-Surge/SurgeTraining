package com.Surge.Aug17;

class FinalVarMethod{
	final float pi = 3.14f;
	int radius = 3;
	final int area() {
		return (int)pi*radius*radius;
	}
}
final class Method extends FinalVarMethod{
//	final int area() {//error:Cannot override the final method from FinalVarMethod
//		return 3*3;
//	}
}

//class FinalClass extends Method{//error:The type FinalClass cannot subclass the final class Method
//	 
// }
public class FinalKeyword {
	public static void main(String[] args) {
		FinalVarMethod finalObj = new FinalVarMethod();
		System.out.println("final variable pi is "+finalObj.pi);
		System.out.println("final variable radius is "+finalObj.radius);
		System.out.println("final method area of circle is "+finalObj.area());
	}
}
