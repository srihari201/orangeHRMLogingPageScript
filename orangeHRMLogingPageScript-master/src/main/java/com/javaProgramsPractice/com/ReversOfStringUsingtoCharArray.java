package com.javaProgramsPractice.com;

public class ReversOfStringUsingtoCharArray {
    public static void main(String[] args) {
        System.out.println("Execution will be started from main method");
        String s="Hi";
        String rev="";

        char[] a=s.toCharArray();
        int len=s.length();
        for(int i=len-1;i>=0;i--){
            rev=rev+a[i];
        }
        System.out.println(rev);
        System.out.println("Execution will be ended");
    }
}
