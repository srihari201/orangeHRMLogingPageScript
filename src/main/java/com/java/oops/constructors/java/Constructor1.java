package com.java.oops.constructors.java;

public class Constructor1 {
    int a;
    int b;

    Constructor1(){
        System.out.println(a);
        System.out.println(b);

    }
    Constructor1(int a, int b){
        System.out.println(this.a);
        System.out.println(this.b);
        this.a=a;
        this.b=b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(this.a);
        System.out.println(this.b);


    }

    Constructor1(double b, String s){
        System.out.println("Double  is " + b);
        System.out.println("String is " + s);

    }

    public static void main(String[] args){
        System.out.println("Execution will be started from main method ");
        Constructor1 c1=new Constructor1();
        Constructor1 c2= new Constructor1(3,4);
        Constructor1 c3=new Constructor1(45.5,"Srihari");
        System.out.println("Execution will be ended");
    }
}
