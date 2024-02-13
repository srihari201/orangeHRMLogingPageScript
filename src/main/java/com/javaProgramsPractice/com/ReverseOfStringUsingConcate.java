package com.javaProgramsPractice.com;

public class ReverseOfStringUsingConcate {
    public static void main(String[] args){
        java.lang.System.out.println("Execution will be started from main method");

        String s=new String("New Year 2024");
        String rev=" ";
        int length =s.length();
        for(int i=length-1;i>=0;i--){
            rev=rev+s.charAt(i);

        }
        java.lang.System.out.println("Reverse of the String " + s + " is : " + rev );
        java.lang.System.out.println("Execution will be ended");
    }
}
