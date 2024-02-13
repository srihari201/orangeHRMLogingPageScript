package com.qa.methods.java;

public class StaticMemOfDifferentClass {

    static String s="Happy world";
    static double d=67.5;
    public static int eng(){
        System.out.println("Executing eng method");
        System.out.println(s);
        System.out.println(d);
        return  65;
    }}

class MainClass{

    public static void main(String[] args){
        StaticMemOfDifferentClass.  eng();



    }


}

