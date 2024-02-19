package com.qa.methods.java;

public class StaticMemOfSameClass {
    public static void main(String[] args)
    {
        math();
    }
    static int a=10;
    static int b=20;
    public static void math(){
        System.out.println("Executing the math method");
        System.out.println(a);
        System.out.println(b);
    }

}
