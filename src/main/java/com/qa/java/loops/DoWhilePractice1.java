package com.qa.java.loops;

public class DoWhilePractice1 {
    int i = VariablesDeclarationBase.variable;

    public static void main(java.lang.String args[]) {
        DoWhilePractice1 dp=new DoWhilePractice1();
        java.lang.System.out.println("Execution will be started from  main method");
        do {
            java.lang.System.out.println(dp.i);
            dp.i++;
        } while (dp.i <= 10);
        java.lang.System.out.println("Execution will be ended");
    }

}