package com.Surge.Sept12;

/*
	Write a program to count number of words in a String?

	Input
	=======
	My name is Pankaj
	I Love Java Programming
	This	is  not   properly formatted		line
	
	Output
	=======
	4
	4
	6
 */
public class NumberOfWords {
	static int countWords(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ' || s.charAt(i) == '\t') {
                count += 1;
                while(i!=s.length() && (s.charAt(i)==' ' || s.charAt(i)=='\t')) {
                    i++;
                }
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "This	is  not   properly formatted		line";
        System.out.println(countWords(str));
    }
}
