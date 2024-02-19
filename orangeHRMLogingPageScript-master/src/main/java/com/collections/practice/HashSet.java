package com.collections.practice;

public class HashSet {
    public static void main(String[] args) {
        java.util.Set mySet= new java.util.HashSet();
        mySet.add("java");
        mySet.add("java");
        mySet.add("Hello");
        mySet.add(123);
        mySet.add(345);
        System.out.println(mySet);

        System.out.println(" The size of the mySet is : " + mySet.size());
    }
}
