package com.qa.methods.java;

public class Methods1 {
    public static void greet() {
        System.out.println("Hello, World!");
    }
    public  static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
    public static int add(int x, int y) {
        return x + y;
    }
    public  String getGreeting() {
        return "Hello, there!";
    }

    public static void main(String args[]){
        greet();
        printSum(2,5);
        int s=  add(7,8);
        System.out.println(s);


    }


}
