package com.java.practice;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int E = sc.nextInt();
		int W = sc.nextInt();

		for(int i=S; i<=E; i+=W){
			double celsius = fahrenheitToCelsius(i);
			System.out.print(i+"\t");
			if(celsius>=0)
				System.out.println((int)Math.floor(celsius));
			else
				System.out.println((int)Math.ceil(celsius));

		}
		
		sc.close();
		
	}

	public static double fahrenheitToCelsius(int fahrenheit) {
		return (5.0 / 9.0) * (fahrenheit - 32);
	}
	
}
