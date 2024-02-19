package com.qa.static_nonStatic;

public class Variable2 {
    public static void main(java.lang.String args[]){
        java.lang.System.out.println("Execution will be started from main method");
        int a=10;
        int b=2;
        java.lang.System.out.println("The value of a is " + a);
        java.lang.System.out.println("The value of b is " + b);
        int c=a+b;
        java.lang.System.out.println("The sum of a and b is " + c);
        a+=b;
        java.lang.System.out.println("The assignment of a & b " + a);

        java.lang.System.out.println("Execution will be ended");

    }
}
