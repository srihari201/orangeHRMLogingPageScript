package com.qa.java.loops;

public class Printing10to1UsingDoWhileLoop {
    public static void main(java.lang.String args[]){
        java.lang.System.out.println("Execution will be started from main method");
        int i=VariablesDeclarationBase.variable2;
        do{
            java.lang.System.out.println(i);
            i--;

        }while(i>=1);
        java.lang.System.out.println("Execution will be ended");
    }
}
