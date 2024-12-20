package com.tasks;

import java.util.Scanner;

public class sum_natural_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        int sum = calculateSum(n);

        System.out.println("Sum of natural numbers up to " + n + ": " + sum);
        
        scanner.close();
    }

    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;

	}

}
