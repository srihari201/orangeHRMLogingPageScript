package com.java.oops;

public class MethodAndConstructor {
    int b;
    int v1;
    int v2;



    public MethodAndConstructor(){
        b=78;
    }
    public MethodAndConstructor(int x, int y){
        v1=x;
        v2=y;



    }
    public void display(){
        int a=10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(v1);
        System.out.println(v2);
    }

    public static void main(String[] args) {
        MethodAndConstructor m1=new MethodAndConstructor();
        m1.display();
        MethodAndConstructor m=new MethodAndConstructor(7,9);
        m.display();
    }
}
