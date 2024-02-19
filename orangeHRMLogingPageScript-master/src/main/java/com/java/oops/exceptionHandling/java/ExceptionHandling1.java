package com.java.oops.exceptionHandling.java;

import java.util.Scanner;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        java.lang.System.out.println("Execution will be started from main method by JVM");
        java.util.Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number...");
        int num= sc.nextInt();
        System.out.println("Entered value is " + num);
        try{ System.out.println(100/num);}
        catch (ArithmeticException e)
        {
            System.out.println("You have entered the invalid input");
            e.printStackTrace();
        }
        java.lang.System.out.println("Execution will be ended");



        System.out.println(100/num);

    }
}
