package com.qa.Arrays;

public class OneDimensionalArray {
    public static  void main (java.lang.String[] args){
        java.lang.System.out.println("Execution will be started from main method");
        //Array Creation
        int[] x =new int[5];
        x[0]=100;
        x[1]=200;
        x[2]=300;
        x[3]=400;
        x[4]=500;

        java.lang.System.out.println("Total length of an array " + x.length);
        java.lang.System.out.println(x[1]);

        for(int i=0;i<5;i++){
            java.lang.System.out.print(x[i] +" ");
        }
        java.lang.System.out.println();





    }
}
