package com.qa.programs;

import java.util.Scanner;

public class CountNumberOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        int num = scanner.nextInt();
        int count = countDigits(num);

        System.out.println("Number of digits in " + num + " is: " + count);

        scanner.close();
    }

    private static int countDigits(int number) {
        // Convert the number to a string and calculate its length
        return  String.valueOf(Math.abs(number)).length();
    }
}


