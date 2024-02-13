package com.java.oops.exceptionHandling.java;

import java.util.Scanner;

public class ExceptionHandling2 {
    public static void main(String[] args){
        System.out.println("Execution will be started from method by JVM");
        int a[] =new int[5] ;
        java.util.Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number.... ");
        int Num=sc.nextInt();
        System.out.println("Print the entered Num " + Num);
        System.out.println();
        System.out.println("Enter the required position ");
        int pos=sc.nextInt();
        a[pos]=Num;
        System.out.println(a[pos]);





        System.out.println("Execution will be ended");
    }
}
