package com.java.oops.constructors.java;

public class DefaultConstrutorEmployee {
    int a;
    int b;
    int c;

    DefaultConstrutorEmployee(){
        a=10;
        b=20;
        c=30;

    }

    public void displayData(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    public static void main(String args[]){
        DefaultConstrutorEmployee dc=new DefaultConstrutorEmployee();//on creating the object the default constructor will be invoked and data will be assigned
        dc.displayData();//


    }
}
