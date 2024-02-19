package com.qa.Arrays;

public class TwoDimensionalArrayUsingForEach {
    public static void main(java.lang.String[]args){
        java.lang.System.out.println("Execution will be started from main method");
        int[][] a=new int[3][2];
        a[0][0]=10;a[0][1]=20;
        a[1][0]=40;a[1][1]=50;
        a[2][0]=50;

        java.lang.System.out.println("Total number of rows is: " + a.length);
        java.lang.System.out.println("Total number of columns is: " +a[1].length);
        java.lang.System.out.println("Total number of columns is: " +a[2].length);
        java.lang.System.out.println(a[2][1]);


        for(int x[]:a){
            for(int v:x){
                java.lang.System.out.print(v + "   ");

            }
            System.out.println();
        }
        java.lang.System.out.println("Execution will be ended");
    }
}
