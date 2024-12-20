package com.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class val_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value to search: ");
        int value = scanner.nextInt();

        if (containsValue(array, value)) {
            System.out.println(value + " is found in the array.");
        } else {
            System.out.println(value + " is not found in the array.");
        }
        scanner.close();
	}

	private static boolean containsValue(int[] array, int value) {
		// TODO Auto-generated method stub
		return Arrays.binarySearch(array, value) >= 0;
	}

}
