package com.javaProgramsPractice.com;

public class ReversOfStringUsingReverseFunction {
    public static void main(String[] args) {
        System.out.println("Execution will be started from main method");
        String s="2024" ;
        java.lang.StringBuffer sb=new StringBuffer(s);
        System.out.println("Reverse of " + s + " is "+ sb.reverse());
        System.out.println("Execution will be ended");
    }
}
