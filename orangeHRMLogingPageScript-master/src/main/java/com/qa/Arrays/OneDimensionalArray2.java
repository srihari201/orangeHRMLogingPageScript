package com.qa.Arrays;

public class OneDimensionalArray2 {
    public static void main(java.lang.String[]args){
        java.lang.System.out.println("Execution will be started from main method");
        int[] a=new int[]{1,2,3,4,5,6};
        for( int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println("The number is even " + a[i]);
            }
            else{
                System.out.println("The number is odd " + a[i]);
            }
        }
        java.lang.System.out.println("Execution will be ended ");
    }
}
