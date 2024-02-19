package com.java.oops.constructors.java;

public class ThisKeyword {
    int a;
    int b;
    public int add(int a, int b){
        this.a=a;
        this.b=b;
        return a+b;
    }
    public static void main (java.lang.String[] args){
        ThisKeyword tk=new ThisKeyword();
        int ret= tk.add(1,2);
        java.lang.System.out.println(ret);
    }
}
