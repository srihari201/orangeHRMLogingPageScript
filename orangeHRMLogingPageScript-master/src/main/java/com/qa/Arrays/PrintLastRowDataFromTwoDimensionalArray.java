package com.qa.Arrays;

public class PrintLastRowDataFromTwoDimensionalArray {
    public static void main(String args[]){
        int[][] a={{1,2,3},{4,5,6}};
        System.out.println("Last Row:");
        int lastRowIndex = a.length - 1;
        for (int j = 0; j < a[lastRowIndex].length; j++) {
            System.out.print(a[lastRowIndex][j] + " ");
        }



    }
}
