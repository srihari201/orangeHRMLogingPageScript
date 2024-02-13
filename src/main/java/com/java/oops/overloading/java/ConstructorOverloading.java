package com.java.oops.overloading.java;

public class ConstructorOverloading {

    int x;
    int y;

    ConstructorOverloading(int a, int b){
        x=a;
        y=b;
        java.lang.System.out.println(x+y);

    }

    ConstructorOverloading(int c, double d){
        java.lang.System.out.println(c+d);

    }


    public static void main(String args[]){
        ConstructorOverloading co=new ConstructorOverloading(34,56);
        ConstructorOverloading co1=new ConstructorOverloading(67,2.5);

    }

}
