package com.qa.java.loops;

public class PracticeWhileLoop3 {

    public static void main(String[] args) {
        System.out.println("Calculating the sum of numbers from 1 to 10 using while loop:");
        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println("Sum: " + sum);
    }
}


