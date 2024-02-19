package com.java.oops.Inheritance.java;



public class SingleInheritance {
    int a;
    int b;
    int c;
    int d;
    public void m1(int a, int b ){
        System.out.println(this.a);
        System.out.println(this.b);

    }
    public void m2(int c, int d){
        System.out.println(this.c);
        System.out.println(this.d);
    }
    class SingleInheritance2 extends  SingleInheritance{

    }
}
