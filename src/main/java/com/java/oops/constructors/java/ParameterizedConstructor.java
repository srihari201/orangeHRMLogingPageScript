package com.java.oops.constructors.java;

public class ParameterizedConstructor {
    int a;
    int b;
    String s;
    ParameterizedConstructor(int x,int y, String s1){
        a=x;
        b=y;
        s=s1;
    }
    public void displayData(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(s);
    }

    public static void main(String args[]){
        ParameterizedConstructor pc=new ParameterizedConstructor(10,20,"Happy World");
        pc.displayData();
    }
}
