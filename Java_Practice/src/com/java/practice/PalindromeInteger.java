package com.java.practice;

import java.util.Scanner;

public class PalindromeInteger {

	public static void main(String[] args) {
		System.out.println("Please Enter a integer to check if its Palindrome : ");
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.println("Please eneter an integer.");
			sc.next();
			System.out.println("Please Enter a integer to check if its Palindrome : ");
		}
		int n = sc.nextInt();
		sc.close();
		if (n < 0)
			System.out.println("Please enter a positive integer.");
		else if (isPalindrome(n))
			System.out.println(n + " is an Integer Palindrome");
		else
			System.out.println(n + " is a not an Integer Palindrome");

	}

	public static boolean isPalindrome(int n) {
		int temp = n;
		int reverse = 0;
		while (n != 0) {
			int rem = n % 10;
			n /= 10;
			reverse = reverse * 10 + rem;
		}
		return temp == reverse;
	}

}
