package com.tasks;

import java.util.Scanner;

public class fibbo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci series upto " + n + " numbers:");
        displayFibonacciSeries(n);
        scanner.close();
    }

	private static void displayFibonacciSeries(int n) {
		// TODO Auto-generated method stub
		int num1 = 0;
        int num2 = 1;

        System.out.print(num1 + " " + num2);

        for (int i = 3; i <= n; i++) {
            int sum = num1 + num2;
            System.out.print(" " + sum);
            num1 = num2;
            num2 = sum;
        }
	}
}
