package com.qa.static_nonStatic;

public class Variable1 {
    int a=3;
    int b=2;
    public static void main(String args[]){
        java.lang.System.out.println("Execution will be started from main method");
        int x=1;
        int y=2;
        x+=y;
        java.lang.System.out.println("The value of X: " + x);
        java.lang.System.out.println("The value of y: " + y);
        y+=x;
        java.lang.System.out.println("The value of y: " + y);
        y=+x;
        java.lang.System.out.println("The value of y: " + y);

        java.lang.System.out.println("Execution will be ended");
    }
}
