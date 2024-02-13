package com.java.oops.Inheritance.java;

public class SingleInheritance1 {
    private int a;
    static  int b;
    static String s;


    public void m1(int a, int b, String s){
        this.a=a;
        this.b=b;
        this.s=s;
        System.out.println(a);
        System.out.println(b);

    }}


class SingleInheritance2 extends  SingleInheritance1{
    public void m2(){
        System.out.println("m2 method");

    }
}

class MainClass extends SingleInheritance1{
    public static void main(String[] args){
        SingleInheritance2 s2=new SingleInheritance2();
        s2.m2();
        s2.m1(10,20,"Srihari");



    }
}








