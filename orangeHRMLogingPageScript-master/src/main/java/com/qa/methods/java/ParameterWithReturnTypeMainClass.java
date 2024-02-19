package com.qa.methods.java;

public class ParameterWithReturnTypeMainClass {
    public static void main(String[] args) {
        ParameterWithReturnType pwr=new ParameterWithReturnType();
        int x= pwr.addition();
        System.out.println(x);
        int y=   pwr.addition1();
        System.out.println(y);
        pwr.sum();

    }
}
