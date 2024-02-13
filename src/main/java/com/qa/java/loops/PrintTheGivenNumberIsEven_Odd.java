package com.qa.java.loops;

public class PrintTheGivenNumberIsEven_Odd {
    public static void main(java.lang.String args[]){
        java.lang.System.out.println("Execution will be started from main method ");
        int i=VariablesDeclarationBase.evenNumber;
        if(i%2==0){
            java.lang.System.out.println("The given Number " + i + "  is even  ");

        }
        else{
            java.lang.System.out.println("The given Number " + i + "  is odd ");
        }


        java.lang.System.out.println("Execution will be ended");
    }

}

