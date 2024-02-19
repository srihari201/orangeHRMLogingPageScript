package com.qa.methods.java;

public class NoParameterWithReturnTypeMainClass {
    public static void main(String[] args) {
        System.out.println("Execution will be started from main method");
        NoParameterWithReturnType NpWR=new NoParameterWithReturnType();
        System.out.println(NpWR.display());
        System.out.println(NpWR.calculator());
        System.out.println("Execution will be ended");
    }
}
