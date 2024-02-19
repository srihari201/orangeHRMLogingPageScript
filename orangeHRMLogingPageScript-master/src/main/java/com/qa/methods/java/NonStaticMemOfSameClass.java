package com.qa.methods.java;

public class NonStaticMemOfSameClass {
    public static void main(String[] args) {
        NonStaticMemOfSameClass ns=new NonStaticMemOfSameClass();
        System.out.println(ns.a);
        new NonStaticMemOfSameClass().a=56;
        System.out.println(new NonStaticMemOfSameClass().a);
        ns.a=90;
        System.out.println(ns.a);




    }




    int a=10;

}
