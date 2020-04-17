package com.qa.testdrivendevelopment;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.apache.commons.lang3.RandomUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import org.apache.commons.lang3.RandomUtils;

public class Questions {
	/**
	 * EXAMPLE: THIS ONE HAS BEEN DONE FOR YOU <br>
	 * 
	 * Given a name, return "Hi" plus the name <br>
	 * <br>
	 * For Example:<br>
	 * greetingExample("John") → "Hi John" <br>
	 * greetingExample("Matt") → "Hi Matt" <br>
	 * greetingExample("Angelica") → "Hi Angelica"
	 * 
	 */
	public String greetingExample(String name) {
		return "Hi " + name;
	}

	/**
	 * Given a string and a char, returns the position in the String where the char
	 * first appears. Ensure the positions are numbered correctly, please refer to
	 * the examples for guidance. <br>
	 * Do not ignore case <br>
	 * Ignore whitespace <br>
	 * If the char does not occur, return the number -1. <br>
	 * <br>
	 * For Example: <br>
	 * returnPosition("This is a Sentence",'s') → 4 <br>
	 * returnPosition("This is a Sentence",'S') → 8 <br>
	 * returnPosition("Fridge for sale",'z') → -1
	 */
	public int returnPosition(String input, char letter) {
		String hello = input;
		String hell = hello.replaceAll(" ", "");
		// System.out.println(hell);
		for (int i = 1; i < hell.length(); i++) {
			if (hell.charAt(i) == letter) {
				// System.out.println(i+1);
				return i + 1;
			}
		}
		return -1;
		// System.out.println("Doesnt exist ");;
	}

//	public static void main(String[] args) {
//		returnPosition("This is a Sentence", 's');
//	}

	/**
	 * Given two Strings of equal length, 'merge' them into one String. Do this by
	 * 'zipping' the Strings together. <br>
	 * Start with the first char of the first String. <br>
	 * Then add the first char from the second String. <br>
	 * Then add the second char from the first String. <br>
	 * And so on. <br>
	 * Maintain case. <br>
	 * You will not encounter whitespace. <br>
	 * <br>
	 * For Example: <br>
	 * zipped("String","Fridge") → "SFtrriidngge" <br>
	 * zipped("Dog","Cat") → "DCoagt"<br>
	 * zipped("True","Tree") → "TTrrueee" <br>
	 * zipped("return","letter") → "rleettutrenr" <br>
	 */
	public static String zipped(String input1, String input2) {
//		String[] str1 = new String[input1.length()];
//		String[] str2 = new String[input2.length()];
//		System.out.println(str1);
//		System.out.println(str2);
//		for (int i = 0; i < str1.length; i++) {
//			for (int j = 0; j < str2.length; j++) {
//				System.out.println("hello" + str1[i] + str2[j]);
//			}
//		}
//		return "lol";
		
		String s = new String();
		for (int i = 0; i < input1.length() || i < input2.length() ; i++) {
			if (i < input1.length()) {
				s.charAt(i);
			}
			if (i < input2.length()) {
				s.charAt(i);
			}
		}
			return "Hello" + s;
	}

	public static void main(String[] args) {
		zipped("String", "Fridge");
	}

	/**
	 * Given an Array of Strings, remove any duplicate Strings that occur, then
	 * return the Array. <br>
	 * Do not ignore case. <br>
	 * <br>
	 * For Example: <br>
	 * removeDuplicates({"Dog"}) → {"Dog"} <br>
	 * removeDuplicates({"Dog","Cat"}) → {"Dog","Cat"} <br>
	 * removeDuplicates({"Dog","Dog","Cat"}) → {"Dog","Cat"} <br>
	 * removeDuplicates({"Dog","DoG","Cat"}) → {"Dog","DoG","Cat"}
	 */
	public String[] removeDuplicates(String[] stringArray) {
		String[] str = stringArray;
		ArrayList<String> arr = new ArrayList<String>();
		// System.out.println("hello" + str);
		// System.out.println("hello" + arr);
		for (int i = 0; i < str.length; i++) {
			// System.out.println("hi"+ str[i]);
			if (!arr.contains(str[i])) {
				arr.add(str[i]);
			}
		}
		String[] nStr = new String[arr.size()];
		for (int j = 0; j < arr.size(); j++) {
			nStr[j] = arr.get(j);
		}
		return nStr;
	}

//	public static void main(String[] args) {
//		removeDuplicates(new String[]{"Dog","Dog","Cat"});
//	}

	/**
	 * Given a large string that represents a csv (comma separated values), the
	 * structure of each record will be as follows:
	 * owner,nameOfFile,encrypted?,fileSize <br>
	 * <br>
	 * Example:
	 * "Bert,private.key,True,1447\nBert,public.key,False,1318\nJeff,private.key,False,1445"
	 * <br>
	 * <br>
	 * Where a comma separates out the fields, and the \n represents a new line.
	 * <br>
	 * For each record, if it is not encrypted, return the names of the owners of
	 * the files in a String Array. <br>
	 * Do not include duplicate names. <br>
	 * <br>
	 * For Example: <br>
	 * csvScan("Jeff,private.key,False,1445") → {"Jeff"} <br>
	 * csvScan("Bert,private.key,True,1447\nBert,public.key,True,1318\nJeff,private.key,False,1445")
	 * → {"Jeff"} <br>
	 * csvScan("Bert,private.key,False,1447\nBert,public.key,False,1318\nJeff,private.key,False,1445")
	 * → {"Bert","Jeff"} <br>
	 * csvScan("Bert,private.key,True,1447\nBert,public.key,False,1318\nJeff,private.key,False,1445")
	 * → {"Bert","Jeff"}
	 */
	public String[] csvScan(String csvInput) {
		return null;
	}

	/**
	 * Write a function to randomly generate a list with 5 even numbers between 100
	 * and 200 inclusive. <br>
	 * <br>
	 * For Example: <br>
	 * listGen() → {100,102,122,198,200} <br>
	 * listGen() → {108,104,106,188,200} <br>
	 * listGen() → {154,102,132,178,164}
	 */
	public int[] listGen() {
		Random ran = new Random();
		int n = ran.nextInt(200);
		return new int[n]  { 0, 0, 0, 0, 0 };
	}

	/**
	 * A prime number is one which is only divisible by one and itself. <br>
	 * Write a function which returns the boolean True if a number is prime, and the
	 * boolean False if not. <br>
	 * <br>
	 * For Example: <br>
	 * isPrime(3) → True <br>
	 * isPrime(8) → False
	 */
	public boolean isPrime(int num) {
//		if (num == 0 || num == 1)
//			return false;
//		else {
//			for (int i = 2; i <num
//			if (num % i == 0) {
//				
//				return false;
//			}
//			return false;
//		}

		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

//	public static void main(String[] args) {
//		assertTrue(questions.isPrime(0));
//		assertFalse(questions.isPrime(1));
//		assertTrue(questions.isPrime(2));
//		assertFalse(questions.isPrime(3));
//		assertTrue(questions.isPrime(4));
//		assertFalse(questions.isPrime(5));
//		assertTrue(questions.isPrime(6));
//		assertFalse(questions.isPrime(7));
//		assertTrue(questions.isPrime(8));
//		assertFalse(questions.isPrime(9));
//		assertTrue(questions.isPrime(10));
//		assertFalse(questions.isPrime(11));
//		assertTrue(questions.isPrime(12));
//		assertFalse(questions.isPrime(3));
//		assertTrue(questions.isPrime(14));
//		assertFalse(questions.isPrime(15));
//		assertTrue(questions.isPrime(16));
//		assertFalse(questions.isPrime(17));
//		assertTrue(questions.isPrime(18));
//		assertFalse(questions.isPrime(19));
//		assertTrue(questions.isPrime(20));
//		assertTrue(questions.isPrime(21));
//		assertFalse(questions.isPrime(22));
//	}

	/**
	 * Wrtie a function which returns the number of vowels in a given string. <br>
	 * You should ignore case. <br>
	 * <br>
	 * For Example: <br>
	 * getVowel("Hello") → 2 <br>
	 * getVowel("hEelLoooO") → 6
	 */
	public int getVowel(String input) {
		int vowel = 0;
		input = input.toLowerCase();
		for (int i = 0; i < input.length(); i++) {
			char character = input.charAt(i);
			if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
				vowel++;
			}
		}
		return vowel;
	}

	/**
	 * Given two string inputs, if one can be made from the other return the boolean
	 * True, if not return the boolean False. <br>
	 * <br>
	 * For Example: <br>
	 * wordFinder("dog", "god") → True <br>
	 * wordFinder("tiredest", "tree") → True <br>
	 * wordFinder("dog", "cat") → False <br>
	 * wordFinder("tripping", "gin") → True
	 */
	public boolean wordFinder(String initialWord, String madeString) {
		return false;
	}

	/**
	 * There is a well known mnemonic which goes "I before E, except after C", which
	 * is used to determine which order "ei" or "ie" should be in a word. <br>
	 * <br>
	 * Write a function which returns the boolean True if a string follows the
	 * mnemonic, and returns the boolean False if not. <br>
	 * <br>
	 * For Example: <br>
	 * iBeforeE("ceiling") → True <br>
	 * iBeforeE("believe") → True <br>
	 * iBeforeE("glacier") → False <br>
	 * iBeforeE("height") → False
	 */
	public boolean iBeforeE(String input) {
		return false;
	}

	/**
	 * A factorial is the product of itself and all previous numbers <br>
	 * eg 3 factorial is 1 x 2 x 3 = 6 <br>
	 * <br>
	 * Write a function which can compute the factorial of a given number between 1
	 * and 10 inclusive. <br>
	 * <br>
	 * For Example: <br>
	 * factorial(1) → 1 <br>
	 * factorial(4) → 24 <br>
	 * factorial(8) → 40320
	 */
	public int factorial(int number) {
		int i;
		int tim = 1;
		int fact = number;
		for (i = 1; i <= fact; i++) {
			tim = tim * i;

		}
		// System.out.println(tim);
		return tim;
	}

}
