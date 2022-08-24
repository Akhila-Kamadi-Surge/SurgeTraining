package com.Surge.Aug24;
class IndexOutOfBoundsCalss{
	int arrayIndex(int[] A,int index) throws Exception{
		if(index < 0 || index > A.length-1) {
			throw new ArrayIndexOutOfBoundsException("index should be within range of array. Your input is "+index);
		}
		else {
			return A[index];
		}
	}
}
public class SpecificExceptionIndexOutOfBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] A = {1,2,3,4,5,6};
			
			IndexOutOfBoundsCalss iob = new IndexOutOfBoundsCalss();
			
			try {
				System.out.println(iob.arrayIndex(A, -1));
			}
			catch(ArrayIndexOutOfBoundsException e) {
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
