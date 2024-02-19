package com.qa.java.loops;

public class Printing2to10EvenNumbersUsingForLoop {
    public static void main(java.lang.String args[]){
        java.lang.System.out.println("Execution will be started from main method");
        for(int i=VariablesDeclarationBase.variable;i<=10;i++){
            if(i%2==0){
                java.lang.System.out.println("The given Number is even: " + i);
            }
        }
        java.lang.System.out.println("Execution will be ended");
    }
}
