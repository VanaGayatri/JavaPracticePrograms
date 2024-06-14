package com.java.practice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// Number of Fibonacci numbers to generate		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Fibonacci numbers to generate: ");
		int n = sc.nextInt();
		sc.close();
		printFibonacciUpToGivenNterms(n);
		printFibonacciUpToGivenRange(n);
	}
	
	public static void printFibonacciUpToGivenNterms(int n) {
		if(n<=0) {
			System.out.println("Please enter a positive interger.");
			return;
		}
		int a=0;
		int b=1;
		System.out.print(a);
		if(n>1)
			System.out.print(" "+b);
		for(int i=2;i<n;i++) {
			int next =a+b;
			System.out.print(" "+next);
			a=b;
			b=next;
		}
	}
	
	public static void printFibonacciUpToGivenRange(int n) {
		if(n<=0) {
			System.out.println("Please enter a positive interger.");
			return;
		}
		int a=0;
		int b=1;
		System.out.println();
		System.out.print(a);
		if(n >= 1)
			System.out.print(" "+b);
		while(true) {
			int next =a+b;
			if(next > n)
				break;
			System.out.print(" "+next);
			a=b;
			b=next;
		}
	}

}
