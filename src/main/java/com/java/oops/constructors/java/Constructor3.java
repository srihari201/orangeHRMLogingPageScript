package com.java.oops.constructors.java;

public class Constructor3 {
    int a;
    int b;
    public  Constructor3(){
        System.out.println(this.a=20);
        System.out.println(this.b=30);

    }
    public Constructor3(int x){
        System.out.println(x);
    }
    public Constructor3(double b, int a, String s){
        System.out.println(b+a);
        System.out.println(s);
    }
    public static void main(String args[]){
        Constructor3 ref=new Constructor3();
        Constructor3 ref1=new Constructor3(50);
        Constructor3 ref2=new Constructor3(50.2,45,"Srihari");

    }
}
