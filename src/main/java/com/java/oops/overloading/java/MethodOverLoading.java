package com.java.oops.overloading.java;

public class MethodOverLoading {

    int a;
    int b;
    int c;

    public void sum(){

        System.out.println(a+b);
    }
    public void sum(int a, int b){

        System.out.println(a+b);
    }
    public void sum(int a, double b){

        System.out.println(a+b);
    }
    public void sum(int a, int b, float f){
        System.out.println(a+b+f);
    }

    public static void main(String[] args) {
        System.out.println("Execution will be started from main method");
        MethodOverLoading mo=new MethodOverLoading();
        mo.sum();
        mo.sum(1,2);
        mo.sum(5,7.5);
        mo.sum(9,10,25.5f);
        System.out.println("Execution wil be ended");
    }
}
