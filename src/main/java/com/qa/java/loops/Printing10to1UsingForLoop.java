package com.qa.java.loops;

public class Printing10to1UsingForLoop {
    public static void main (java.lang.String args[]){
        java.lang.System.out.println("Execution will be started from main method")
        ;
        // Example: Use break to exit the loop early
        int i = 1;
        while (true) {
            System.out.println(i);
            i++;
            if(i>10){
                break;
            }
        }


    }
}
