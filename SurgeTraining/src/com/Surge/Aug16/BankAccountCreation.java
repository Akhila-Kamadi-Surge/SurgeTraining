package com.Surge.Aug16;
import java.util.Calendar;
import java.util.Scanner;
import java.text.*;
/*
 * A person is opening an account on 16th August 2022 at 4pm. 
 * Account number can be IFSC(static variable) + 081620221600 + 001
 * Suppose IFSC is SBH123 then account number will be SBH123081620221600001
 * Make a counter and increase it for each customer.
 */
class Account{
	static String ifsc;
	String firstName;
	String lastName;
	static int i = 1;
	static {
		ifsc = "SBH123";
	}
//	Account(String fName, String lName){
//		firstName = fName;
//		lastName = lName;
//	}
	private String date(Calendar instance) {
		String format = "MMddyyyykm";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		instance = Calendar.getInstance();
		String formattedDate = sdf.format(instance.getTime());
		return formattedDate;
	}
	void generateAccount() {
		String dt = date(Calendar.getInstance());
		System.out.println("Hi "+firstName+" "+lastName+" your account number is :"+ifsc+dt+"00"+String.valueOf(i++));
	}

}
public class BankAccountCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		do {
			Account acct = new Account();
			System.out.println("Enter your first name: ");
			acct.firstName = sc.next();
			System.out.println("Enter your last name: ");
			acct.lastName = sc.next();
			acct.generateAccount();
			i++;
		}while(i<=3);
	}

}
