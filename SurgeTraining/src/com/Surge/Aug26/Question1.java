package com.Surge.Aug26;

/*
 * -	Write a program which throws NullPointer Exception
 */
class NullPointer{
	void exceptionNullPointer(String s) throws NullPointerException{
		if(s==null) {
			throw new NullPointerException("Accessing length of null string");
		}
		else {
			System.out.println("Length of the string : "+s.length());
		}
	}
}
public class Question1 {
	public static void main(String[] args) {
		String s = "";
		String s2 = null;
		NullPointer npObj = new NullPointer();
		try {
			npObj.exceptionNullPointer(s);
			
			npObj.exceptionNullPointer(s2);
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			System.out.println("Code executed without abrupt termination");
		}
	}
}
