package com.java.practice;

import java.util.ArrayList;
import java.util.List;

public class PrintDivisors {

	public static void main(String[] args) {

		int n = 36;
		List<Integer> divisors = printDivisors(n);
		System.out.println("Divisors of " + n + " are: " + divisors);

	}

	public static List<Integer> printDivisors(int n) {
		// Instantiate the list using ArrayList
		List<Integer> divisors = new ArrayList<>();

		// Loop to find all divisors of n
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				divisors.add(i);
			}
		}

		return divisors;
	}

}
