package com.Surge.Practice.Programs;
/*
 * Java Program to Print all Unique Words of a String
 */
import java.util.HashSet;

public class PrintUniqueWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Fear leads to anger anger leads to hatred hatred leads to conflict conflict leads to suffering";
		int len = sentence.length();
		String[] sentenceArr = sentence.split(" ");
		HashSet<String> word = new HashSet<String>();
		for (int i = 0; i < sentenceArr.length; i++) {
			word.add(sentenceArr[i]);
		}
		System.out.println(word);
	}

}
