package com.java.practice;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		System.out.println("Enter a String to check if its a Palindrome : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().trim();
		sc.close();

		if (isPalindrome(s))
			System.out.println(s + " is a String Palindrome.");
		else
			System.out.println(s + " is not a String Palindrome.");

//		if (isPalindromeOrNot(s))
//			System.out.println(s + " is a String Palindrome.");
//		else
//			System.out.println(s + " is not a String Palindrome.");

	}

	// General
	public static boolean isPalindrome(String s) {
		String reverse = "";
		for (int i = 0; i < s.length(); i++) {
			reverse += s.charAt(s.length() - 1 - i);
		}
		if (!s.equalsIgnoreCase(reverse))
			return false;
		return true;
	}

	// Efficient
	public static boolean isPalindromeOrNot(String s) {
		StringBuilder reverse = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse.append(s.charAt(i));
		}
		String reversedString = reverse.toString();
		if (!s.equalsIgnoreCase(reversedString))
			return false;
		return true;
	}

}
