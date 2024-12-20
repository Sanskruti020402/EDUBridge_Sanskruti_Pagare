package com.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class rev_arr {

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

        reverseArray(array);

        System.out.println("Reversed array: " + Arrays.toString(array));

        scanner.close();
	}

	private static void reverseArray(int[] array) {
		// TODO Auto-generated method stub
		int left = 0;
        int right = array.length - 1;
        while (left < right) {
        	//swap elements
        	int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            //move pointers
            left++;
            right--;

        }
	}
}
