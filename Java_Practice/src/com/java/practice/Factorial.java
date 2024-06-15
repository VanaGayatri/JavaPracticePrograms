package com.java.practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Please Enter a integer to find the factorial of it : ");
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
		else {
			int factorialIterative = calculateFactorialIterative(n);
			System.out.println("Factorial of " + n + " is (Iterative) :" + factorialIterative);
			int factorialRecursive = calculateFactorialRecursive(n);
			System.out.println("Factorial of " + n + " is (Recursive) :" + factorialRecursive);
		}

	}

	public static int calculateFactorialIterative(int n) {
		if (n == 0)
			return 1;
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}

	public static int calculateFactorialRecursive(int n) {
		if (n == 0)
			return 1;
		return n * calculateFactorialRecursive(n - 1);
	}

}
