package com.tasks;

import java.util.Scanner;

public class multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int i = 1; 
        System.out.println("\nMultiplication Table of " + num + ":");
        while (i <= 10) 
        { 
            System.out.println(num + " x " + i + " = " + (num * i));
            i++; 
        }
        scanner.close();

	}

}
