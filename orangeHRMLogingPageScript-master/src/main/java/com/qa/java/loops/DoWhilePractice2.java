package com.qa.java.loops;

public class DoWhilePractice2 {
    int i=VariablesDeclarationBase.variable;
    boolean status=true;
    public static void main (java.lang.String args[]){
        DoWhilePractice2 dp2=new DoWhilePractice2();
        java.lang.System.out.println("Execution will be started from main method");

        do{
            java.lang.System.out.println(dp2.i);
            dp2.i++;
            if(dp2.i>10){
                break;
            }

        }while(true);

        java.lang.System.out.println("Execution will be ended");


    }
}
