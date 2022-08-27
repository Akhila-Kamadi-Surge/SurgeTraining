package com.Surge.Practice.Programs;

//Write a Java Program to find the duplicate characters in a string

public class StringDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AkhilaaKamadi";
        str = str.toLowerCase();
        int len = str.length();
        String res = "";
        for(int i = 0; i < len; i++) {
            int count = 1;
            for(int j = i+1; j < len; j++) {
                if(str.charAt(j)==str.charAt(i)) {
                    count++;
                }
            }
            //if(count>1 && res.indexOf(String.valueOf(str.charAt(i)))==-1) { }
            if(count>1 && !res.contains(String.valueOf(str.charAt(i)))) {
                
                res+=str.charAt(i)+" ";
            }
        }
        System.out.println(res);
	}

}
