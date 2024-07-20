package com.java.practice;

import java.util.Scanner;

public class SumEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int i, sumEven = 0, sumOdd = 0;
		while (n > 0) {
			i = n % 10;
			if (i % 2 == 0)
				sumEven += i;
			else
				sumOdd += i;
			n = n / 10;
		}

		System.out.println(sumEven + " " + sumOdd);
	}

}
