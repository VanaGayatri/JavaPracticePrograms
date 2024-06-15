package com.java.practice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Please Enter a integer to check if its an Armstrong Number : ");
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.println("Please enter an integer.");
			sc.next();
			System.out.println("Please Enter a integer to check if its an Armstrong Number : ");
		}
		int n = sc.nextInt();
		sc.close();
		if (n < 0)
			System.out.println("Please enter a positive integer.");
		else if (isArmstrongNumber(n))
			System.out.println(n + " is an Armstrong Number");
		else
			System.out.println(n + " is a not an Armstrong Number");

	}

	public static boolean isArmstrongNumber(int n) {
		int temp = n;
		int numDigits = String.valueOf(n).length();
		int sum = 0;
		// Calculate the sum of the digits raised to the power of numDigits
		while (temp > 0) {
			int rem = temp % 10;
			sum += Math.pow(rem, numDigits);
			temp /= 10;
		}
		// Compare the sum with the original number
		return n == sum;

	}
}
