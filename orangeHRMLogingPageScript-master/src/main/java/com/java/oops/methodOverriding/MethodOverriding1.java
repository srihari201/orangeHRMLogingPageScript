package com.java.oops.methodOverriding;

public class MethodOverriding1 {
    public  void m1(){
        System.out.println("method m1");
    }
}
class MethodOverriding2 extends  MethodOverriding1{
    public  void m1(){
        System.out.println("method m2");
    }
}
class MainClas6 {
    public static void main(String[] args) {


        MethodOverriding2 ref = new MethodOverriding2();
        ref.m1();
        ref.m1();
    }
}