package com.qa.Arrays;

public class TwoDimensionalArray1 {
    public static void main(String[] args) {
        int[][] a=new int[3][2];
        a[0][0]=10;
        a[0][1]=20;

        a[1][0]=30;
        a[1][1]=40;

        a[2][0]=50;
        a[2][1]=60;

        java.lang.System.out.println("Total number of Rows: " + a.length);
        java.lang.System.out.println("Total number of Columns: " + a[0].length);
        for(int r=0;r<a.length;r++){
            for(int c=0;c<a[r].length;c++){
                java.lang.System.out.print(a[r][c] + "  ");
            }
            System.out.println();
        }

    }


}
