package com.java.practice;

import java.util.Scanner;

public class PowerofNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();

		System.out.println((int) Math.pow(x, n));
		sc.close();
	}

}
