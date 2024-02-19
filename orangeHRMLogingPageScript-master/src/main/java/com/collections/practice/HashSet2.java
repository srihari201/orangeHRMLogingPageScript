package com.collections.practice;

public class HashSet2 {
    public static void main(java.lang.String args[]){
        java.lang.System.out.println("Execution will be started from main method");
        java.util.HashSet myset=new java.util.HashSet();
        java.lang.System.out.println("The size of the My set before adding the elements is : " + myset.size());

        myset.add(100);
        myset.add(100);
        myset.add("Welcome");
        myset.add("Collections");
        myset.add(null);
        myset.add(null);

        java.lang.System.out.println("The size of the My set after adding the elements is : " + myset.size());
        java.lang.System.out.println(myset );
        myset.remove(100);
        System.out.println(myset);

        for(Object x:myset){
            System.out.println(x);
        }

        java.lang.System.out.println("Execution will be ended");
    }
}
