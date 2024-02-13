package com.programs;

public class MultiplesOf2 {

        public static void main(String[] args) {
            int count = 10; // Number of multiples to print
            System.out.println("The first " + count + " multiples of 2 are:");

            for (int i = 1; i <= count; i++) {
                int multiple = 2 * i;
                System.out.println(multiple);
            }
        }
    }


