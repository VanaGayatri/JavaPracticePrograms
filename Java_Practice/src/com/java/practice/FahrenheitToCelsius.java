package com.java.practice;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int E = sc.nextInt();
		int W = sc.nextInt();
		sc.close();

		for (int i = S; i <= E; i += W) {
			int celsius = (int) ((5.0 / 9) * (i - 32));
			System.out.print(i + "\t");
			if (celsius >= 0)
				System.out.println(celsius);
			else
				System.out.println(celsius);

		}
	}
}
