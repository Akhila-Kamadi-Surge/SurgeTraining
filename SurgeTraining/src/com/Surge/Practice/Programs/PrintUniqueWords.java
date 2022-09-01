package com.Surge.Practice.Programs;
/*
 * Java Program to Print all Unique Words of a String
 */
import java.util.HashSet;
import java.util.Set;

public class PrintUniqueWords {
	static Set<String> uniqueWords(String sentence){
		int len = sentence.length();
		String[] sentenceArr = sentence.split(" ");
		HashSet<String> word = new HashSet<String>();
		for (int i = 0; i < sentenceArr.length; i++) {
			word.add(sentenceArr[i]);
		}
		return word;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Fear leads to anger anger leads to hatred hatred leads to conflict conflict leads to suffering";
		
		System.out.println(uniqueWords(sentence));
	}

}
