package com.tasks;

import java.util.*;

public class rem_arr {

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

        System.out.println("Enter the index number to remove from the array: ");
        int indexToRemove = scanner.nextInt(); 

        int[] newArray = removeElement(array, indexToRemove);

        System.out.println("Array after removing element at index " + indexToRemove + ": " + Arrays.toString(newArray));
        
        scanner.close();
	}

	private static int[] removeElement(int[] array, int index) {
		// TODO Auto-generated method stub
		if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        int[] newArray = new int[array.length - 1];

        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);

        return newArray;
	}

}
