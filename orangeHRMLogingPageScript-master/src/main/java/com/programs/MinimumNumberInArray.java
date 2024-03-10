package com.programs;

public class MinimumNumberInArray {
    public static void main(String[] args) {
        System.out.println("Execution will be started from main method");
        int a[] ={2,3,4,50,0};
        //we are making the first element as min and comparing other elements with this min
        //if any of the element is min than this min variable that is the min value
        int min=a[0];
        for(int i=1;i<a.length;i++){
            System.out.println("Entered into for loop body");
            if(a[i]<min){
                min=a[i];
            }

        }
        System.out.println("The minimum value is " + min);
        System.out.println("Execution will be ended");
    }
}
