package com.qa.java.loops;

public class Printing2to10EvenNumbersUsingWhileLoop {
    public static void main(java.lang.String args[]){
        java.lang.System.out.println("Execution will be started from main method \n");

        while(VariablesDeclarationBase.variable<=10) {
            if (VariablesDeclarationBase.variable % 2 == 0) {
                java.lang.System.out.println("The given number is even: " + VariablesDeclarationBase.variable + "\n");
            }
            VariablesDeclarationBase.variable++;
        }
        java.lang.System.out.println("Execution will be ended ");

    }
}
