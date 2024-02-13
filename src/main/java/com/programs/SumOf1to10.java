package com.programs;

public class SumOf1to10 {
    public static void main(String args[]){
        System.out.println("Execution will be started from main method");
        int sum=0;
        for(int i=1;i<=10; i++){
            System.out.println("The value of i: " + i);
            sum+=i;
            System.out.println("The value of sum  is :" + sum);
        }
        System.out.println(sum);
        System.out.println("Execution will be ended");
    }
}
