package com.qa.Strings;

public class SampleString {
    public static void main (java.lang.String[] args){
        java.lang.System.out.println("Execution will be started from main method");
        String name="Hello world";
        java.lang.System.out.println("Total length of the " + name + " String is: " + name.length());
        java.lang.System.out.println("Printing the third character from the " + name  + " using charAt method: " + name.charAt(3));
        for(int i=0;i<name.length();i++){
            java.lang.System.out.println(name.charAt(i));
        }
        java.lang.System.out.println("Execution will be ended");
    }
}
