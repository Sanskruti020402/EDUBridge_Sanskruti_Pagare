package com.tasks;

import java.util.Scanner;

public class leep_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        scanner.close();
	}

	private static boolean isLeapYear(int year) {
		// TODO Auto-generated method stub
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

}
