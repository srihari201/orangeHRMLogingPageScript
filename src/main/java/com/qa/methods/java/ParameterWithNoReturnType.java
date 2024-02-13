package com.qa.methods.java;

public class ParameterWithNoReturnType {
    public void add(int a, int b){
        System.out.println("The value of a: " + a);
        System.out.println("The value of b: " + b);
        int res=a+b;
        System.out.println("The addition of "+ a + " and "+ b + " is: " + res);
    }
}
