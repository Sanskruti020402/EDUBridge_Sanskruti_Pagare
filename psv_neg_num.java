package com.tasks;

import java.util.Scanner;

public class psv_neg_num {

	public void checkNumber() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println(number + " is zero.");
        }
        scanner.close();
      }

    public static void main(String[] args) {
    	psv_neg_num checker = new psv_neg_num();
        checker.checkNumber();

	}

}
