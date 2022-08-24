package com.Surge.Aug24;

class NullPointerExceprionClass{
	int StringLength(String s) throws NullPointerException{
		if(s==null) {
			throw new NullPointerException("Cannot fetch length of null string");
		}
		else {
			return s.length();
		}
	}
}
public class SpecificExceptionNullPointer {
	public static void main(String[] args) {
		NullPointerExceprionClass npe = new NullPointerExceprionClass();
		
		String str = "";
		String str2 = null;
		
		try {
			System.out.println("Length of empty string is "+npe.StringLength(str));//o/p : 0
			System.out.println(npe.StringLength(str2));// throws exception
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
