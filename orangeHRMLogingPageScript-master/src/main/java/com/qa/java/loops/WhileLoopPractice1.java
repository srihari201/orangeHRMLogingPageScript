package com.qa.java.loops;

public class WhileLoopPractice1 {
    public static void main(java.lang.String args[]){
        int i=VariablesDeclarationBase.variable;
        boolean status=true;
        java.lang.System.out.println("Execution will be started from main method");
        while(status){
            java.lang.System.out.println(i);
            i++;
            if(i>14){
                break;
            }

        }
        java.lang.System.out.println("Execution will be ended");
    }
}
