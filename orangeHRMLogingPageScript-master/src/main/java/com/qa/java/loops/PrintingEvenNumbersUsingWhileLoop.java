package com.qa.java.loops;


public class PrintingEvenNumbersUsingWhileLoop {
    public static void main (java.lang.String args[]){
        java.lang.System.out.println("Execution will be started from main method");
        int i= VariablesDeclarationBase.evenNumber;
        while(i<=10){
            java.lang.System.out.println("The number is even " + i);
            i=i+2;

        }
        java.lang.System.out.println("Execution wil be ended");
    }

}
