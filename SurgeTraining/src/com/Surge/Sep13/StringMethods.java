package com.Surge.Sep13;

public class StringMethods {
	static void stringMethods(String str1, String str2) {
		
		System.out.println("char at index 10"+str1.charAt(10));//a
		
		System.out.println("ASCII value of character at index 5 : "+str1.codePointAt(5));
		
		System.out.println("ASCII value of character at index 3 : "+str1.codePointBefore(4));
		
		System.out.println("Count of number of ASCII characters between 1 to 5 : "+str1.codePointCount(1, 5));
		
		//compareTo() -> compares two strings and returns their difference
		//str>str2 => result is positive
		//str==str2 => result is 0
		//str<str2 => result is negative
		System.out.println("Comparing two strings : "+str1.compareTo(str2));
		
		System.out.println("Comparing two strings -> case-insensitive : "+str1.compareToIgnoreCase(str2));
		
		System.out.println("Concatinating two strings : "+str1.concat(str2));
		
		System.out.println(str2+" is present in "+str1+" ? "+str1.contains(str2));
		
		System.out.println(str2+" has exactly same characters as "+str1+" ? "+str1.contentEquals(str2));
		
		System.out.println("Given sequence \"Akhila K\" exactly matches the string "+str1+" ? "
							+str1.contentEquals(new StringBuffer("Akhila K")));
		
		System.out.println(str1+" ends with "+str2+" ? "+str1.endsWith(str2));
		
		System.out.println("Are both "+str1+" and "+str2+" equal? "+str1.equals(str2));
		
		System.out.println("Are both "+str1+" and "+str2+" equal? -> Case-insensitive : "+str1.equalsIgnoreCase(str2));
		
		System.out.println("Using format specifier : "+String.format("name is %s",  str1));
		
		byte[] getBytes = str1.getBytes();
		System.out.println("How many bytes is string "+str1+" ? ");
		for(byte i : getBytes) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("class of the string : "+str1.getClass());
		
		System.out.println("Hascode of the string "+str1+" : "+str1.hashCode());
		
		//indent() -> If n > 0 then n spaces (U+0020) are inserted at the beginning of each line. 
		//If n < 0 then up to n white space characters are removed from the beginning of each line.
		//If n == 0 then the line remains unchanged. However, line terminators are still normalized.
		//string with indentation adjusted and line endings normalized
		System.out.println(".indent() adds white spaces at the beginning and also if we use println stream it adds a new line");
		System.out.print("Adding white spaces at start of string : "+str1.indent(5));
		System.out.println("Removing white spaces at start of string if persent: "+str1.indent(-5));//Adds a new line too
		System.out.println("Removing white spaces at start of string if persent: "+"    Akhila".indent(-5));
		System.out.println("Unchanged string : "+str1.indent(0));
		
		System.out.println("First index of \'a\' in string "+str1+" : "+str1.indexOf('a'));
		System.out.println("First index of string "+str2+" in "+str1+" : "+str1.indexOf(str2));
		System.out.println("Index of \'a\' in string "+str1+" from index 5 : "+str1.indexOf('a', 5));
		System.out.println("Index of "+str2+" in string "+str1+" from index 5 : "+str1.indexOf(str2, 5));
		
		String newStr = new String("Akhila");
		System.out.println("Pointing to the existing string from string pool : "+newStr.intern());
		
		System.out.println("Checking if string is blank i.e no characters except white space in "+str1+" : "+str1.isBlank());
		
		System.out.println("Is string "+str1+" empty? "+str1.isEmpty());
		
		System.out.println("Using \'-\' as delimiter to join 3 strings "+String.join("-", str1, str2, newStr));
		
		System.out.println("Last index of \'a\' in "+str1+" : "+str1.lastIndexOf('a'));
		System.out.println("Last index of "+str2+" in "+str1+" : "+str1.lastIndexOf(str2));
		System.out.println("Last index of \'a\' in string "+str1+" from index 5 : "+str1.lastIndexOf('a', 5));
		System.out.println("Last index of "+str2+" in string "+str1+" from index 5 : "+str1.lastIndexOf(str2, 5));//returns -1 if not present
		
		System.out.println("Length of the string "+str1+" : "+str1.length());
		
		System.out.println("Does String contains regex (.*)khila(.*) ? : "+str1.matches("(.*)khila(.*)"));//true
		System.out.println("\"Does String contains regex khila ? : "+str1.matches("khila"));//false
		
		System.out.println("Repeating the string "+str1+" 3 times : "+str1.repeat(3));
		
		System.out.println("Replacing \'a\' with \'e\' "+str1.replace('a', 'e'));
		System.out.println("Replacing \"Akhila\" in string "+str1+" with other sequence "+str1.replace("Akhila", "Alekhya"));
		System.out.println("Replacing space with empty string "+str1.replaceAll(" ", ""));
		
		String sentence = "Eventually, everything connects.";
		System.out.println("Replace first space with \'-\' "+sentence.replaceFirst(" ", "-"));
		
		System.out.println("Check if "+str1+" starts with "+str2+" : "+str1.startsWith(str2));
		System.out.println("Check if "+str1+" starts with "+str2+" from index 3: "+str1.startsWith(str2, 3));
		
		String name = "    Akhila   ";
		System.out.println("Removing all leading and trailing spaces of "+name+" : "+name.strip());
		System.out.println("Removing all leading spaces of "+name+" : "+name.stripLeading());
		System.out.println("Removing all trailing spaces of "+name+" : "+name.stripTrailing());
		
		System.out.println("substring of"+name+" from index 5 :"+name.substring(5));
		System.out.println("substring of"+name+" from index 4 to index 9 :"+name.substring(4, 9));
//		System.out.println("Sub-sequence is same as substring");
		System.out.println("sub sequence of "+name+" from index 4 to index 9 : "+name.subSequence(4, 9));
		
		
		System.out.println("converting "+str1+" to lower-case "+str1.toLowerCase());
		System.out.println("converting "+str1+" to upper-case "+str1.toUpperCase());
		
		Integer a = 5;//Only wrapper classes can be converted to string, primitive data types are not allowed
		System.out.println("Converting Integer to String using .toString() : "+a.toString());
		//Converting Primitive data types to string
		int x = 40;
		String s = ""+x;
		System.out.println("Converting int(primitive data type) to String :"+s);
		
		System.out.println("Trimming leading and trailing white spaces in string "+name+" : "+name.trim());
		
		System.out.println("IntStream of char values of string "+str1 +" : "+str1.chars());
		
		System.out.println("Converting primitive data types to String using String.valueOf() method");
		System.out.println("int to String using String.valueOf() method : "+String.valueOf(10));
		System.out.println("boolean to String using String.valueOf() method : "+String.valueOf(true));
		System.out.println("char to String using String.valueOf() method : "+String.valueOf('d'));
		System.out.println("long to String using String.valueOf() method : "+String.valueOf(20000000l));
		System.out.println("float to String using String.valueOf() method : "+String.valueOf(20.5f));
		System.out.println("double to String using String.valueOf() method : "+String.valueOf(2000000000.5555));
		
		String quote = "One thing at a time";
		String[] splitStr = quote.split(" ");
		System.out.println("Splitting at space and storing in String array");
		for(String i : splitStr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Converting string to character array");
		char[] chArr = str1.toCharArray();
		System.out.println("character array : ");
		for(char i : chArr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Coverting char[] to String using String.valueOf "+String.copyValueOf(chArr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Akhila Kamadi";
		String str2 = "akhila";
		
		stringMethods(str1, str2);
	}

}
