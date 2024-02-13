package com.qa.methods.java;

public class SampleMethod2 {
    public static int m1(int a, int b){
        return  a+b;
    }
    public java.lang.String m2(int x, double b){
        return  "m2  method returning";
    }
    public static void main (java.lang.String args[]){
        m1(10,20);


        SampleMethod2 s2Object=new SampleMethod2();
        String ref=s2Object.m2(10,1.5);
        System.out.println(10);
        java.lang.System.out.println(1.5);
        java.lang.System.out.println(ref);
    }
}
