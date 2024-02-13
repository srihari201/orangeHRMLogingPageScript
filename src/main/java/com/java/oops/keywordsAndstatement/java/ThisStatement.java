package com.java.oops.keywordsAndstatement.java;

public class ThisStatement {
    ThisStatement(){
        System.out.println("Zero argument constructor");
    }
    ThisStatement(int a){
        this();
        System.out.println("int argument constructor");

    }
    ThisStatement(double b){
        this(65);
        System.out.println("double argument constructor");
    }

    public static void main(String[] args){
        ThisStatement ts=new ThisStatement(56.0);

    }

}
