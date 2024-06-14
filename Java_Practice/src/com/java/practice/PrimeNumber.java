package com.java.practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// check if given number is Prime
		System.out.println("Please enter a number to check if its Prime or Composite : ");
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			System.out.println("Please enter a valid integer : ");
			sc.next();
			System.out.println("Please enter a number to check if its Prime or Composite : ");
		}
		int n = sc.nextInt();
		sc.close();

		if (n < 0) {
			System.out.println("Please Enter a positive Number");
		} else if (n == 0 || n == 1) {
			System.out.println(n + " is a neither Prime nor Composite.");
		} else if (isPrime(n) && isPrimeOrNot(n)) {
			System.out.println(n + " is a Prime Number");
		}
//		else if (isPrimeOrNot(n)) {
//			System.out.println(n + " is a Prime Number");
//		}
		else {
			System.out.println(n + " is a composite number.");
		}
	}

	// general
	public static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	// more efficient
	public static boolean isPrimeOrNot(int n) {
		if (n <= 3)
			return true;
		if (n % 2 == 0 || n % 3 == 0)
			return false;
		for (int i = 2; i * i <= n; i += 6) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
