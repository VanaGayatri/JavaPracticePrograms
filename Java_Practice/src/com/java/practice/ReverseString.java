package com.java.practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter a String to check to reverse : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().trim();
		sc.close();
		StringBuilder reverse = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse.append(s.charAt(i));
		}
		String reverseString = reverse.toString();
		System.out.println("The reversed String is " + reverseString);
	}

}
