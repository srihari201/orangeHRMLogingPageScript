package com.java.oops.keywordsAndstatement.java;

public class SuperKeyword {
    int a=20;
    int b=30;
    void main1(){
        System.out.println("sample method ");
    }}

class MainClass extends  SuperKeyword{
    void childMethod(){
        System.out.println("Executing child method");
        super.main1();
        System.out.println(a);
        System.out.println(super.a);
        System.out.println(super.b);
    }}
class MainClassProcess{
    public static void main(String[] args) {
        MainClass mc=new MainClass();
        mc.childMethod();



    }

}
