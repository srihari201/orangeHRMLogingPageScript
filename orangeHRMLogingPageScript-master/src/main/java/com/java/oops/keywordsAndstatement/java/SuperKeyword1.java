package com.java.oops.keywordsAndstatement.java;

public class SuperKeyword1 {
    int a=20;
    int b=25;
    public void m1(){
        System.out.println("Executing m1 method");

    }
    class SuperKeyword2{
        public void m2(){
            System.out.println("Executing m2 method");
            System.out.println(a);
        }
        SuperKeyword2(){
            int a=200;
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        System.out.println("Execution will be started from main method by JVM");

        System.out.println("Execution will be ended");

    }
}
