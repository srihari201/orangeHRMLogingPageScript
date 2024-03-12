package com.programs;

public class ReversNumberByUsingStringBuffer {
    public static void main(String[] args) {
        System.out.println("Execution will be started from main method by JVM");
        int num=123456;
        System.out.println("The original number is " + num);
        //By using String.valueOf(num) we are converting int to String
        StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev= sb.reverse();
        System.out.println("The reverse number is " + rev);
        System.out.println("Execution will be ended");
    }
}
