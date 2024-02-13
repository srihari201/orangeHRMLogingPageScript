package com.qa.methods.java;

public class StaticMemOfSameClassReInitialiazation {
    public static void main (String [] args){
        System.out.println("Execution will be started from main method by JVM");
        System.out.println(a);
        StaticMemOfSameClassReInitialiazation.a=23;
        System.out.println(a);


        System.out.println("Execution will be ended");

    }

    static int a=10;


}
