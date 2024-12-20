package com.tasks;

import java.util.Scanner;

public class sum_avg_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = computeSum(array);
        double average = computeAverage(sum, n);

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
        
        scanner.close();
	}

	private static int computeSum(int[] array) {
		// TODO Auto-generated method stub
		int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
	}

	private static double computeAverage(int sum, int n) {
		// TODO Auto-generated method stub
		return (double) sum /n;
	}
	

}
