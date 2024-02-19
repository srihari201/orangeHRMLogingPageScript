package com.java.oops.overloading.java;

public class MethodOverloading2 {
    public static void pay(int i){
        System.out.println("Enter the amount int  format");
        System.out.println(i);


    }
    public void pay(double b){
        System.out.println("Enter the amount in double format");
        System.out.println(b);
    }

    public int  pay(String s){
        System.out.println("Enter the amount in String format");
        System.out.println(s);
        return 56;

    }

    public static void main(String[] args) {
        MethodOverloading2 ref=new MethodOverloading2();
        ref.pay(1000);
        ref.pay(10000);
        int res= ref.pay("one Lakh rupees");
        System.out.println(res);


    }
}
