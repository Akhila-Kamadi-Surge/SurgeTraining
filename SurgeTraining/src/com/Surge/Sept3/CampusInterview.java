package com.Surge.Sept3;

import java.util.ArrayList;

/*
 * Campus Interview -> write a program for campus interview eligibility for using custom exception.
                         =>student must pass for all subject with GPA 7.0 or more than 7
                         =>above condition not matched the student not eligible for campus interview.
 */
class CampusSelection{
	float cGPA(int[] marks) {
		int percent = 0;
		for(int i = 0; i < marks.length; i++) {
			percent += marks[i];
		}
		percent /= marks.length;
		//Formula : Percentage/9.5 = CGPA
		float cgpa = percent/9.5f;
		return cgpa;
	}
	
	void checkEligibilty(float cgpa) throws InterviewSelectionException{
		if(cgpa >= 7.0) {
			System.out.println("Congratulations! you are eligible for interview");
		}
		else {
			throw new InterviewSelectionException("We are sorry! you are not eligible for interview, as your CGPA is less than 7.0");
		}
		
	}
}

public class CampusInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = {10,20,30,40,50,60};
		marks = new int[] {60,70,90,80,75,65};
		CampusSelection interview = new CampusSelection();
		
		try {
			interview.checkEligibilty(interview.cGPA(marks));
		}
		catch (InterviewSelectionException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
