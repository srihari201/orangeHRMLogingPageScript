package com.qa.Strings;

public class ReplaceMethod {
    public static void main(String [] args){
        System.out.println("Execution will be started from main method");
        String  s=new String("Hello world");
        System.out.println( s.replace('l', 'i'));
        System.out.println(s.replace("Hello","New Year"));
    }
}
