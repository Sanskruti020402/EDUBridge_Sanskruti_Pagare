package com.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class dupli_val_arr {

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

        System.out.println("Original array: " + Arrays.toString(array));

        findDuplicates(array);

        scanner.close();
	}

	private static void findDuplicates(int[] array) {
		// TODO Auto-generated method stub
		boolean[] duplicates = new boolean[array.length];
		for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && !duplicates[j]) {
                    System.out.println("Duplicate found: " + array[i]);
                    duplicates[j] = true;
                }
            }
		}
	}
}
