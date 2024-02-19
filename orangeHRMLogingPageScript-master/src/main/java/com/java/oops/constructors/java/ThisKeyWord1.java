package com.java.oops.constructors.java;


public class ThisKeyWord1 {
    int a;
    int b;
    ThisKeyWord1(int a, int b){
        this.a=a;
        this.b=b;
    }
    void displayData(){
        java.lang.System.out.println(a+b);
    }
    public static void main (java.lang.String args[]){
        ThisKeyWord1 t1=new ThisKeyWord1(10,20);
        t1.displayData();
    }
}
