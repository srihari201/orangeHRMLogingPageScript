package com.qa.methods.java;

public class SampleMethod1 {
    public static void start(){
        System.out.println("Start Method");
    }
    public static void end(){
        start();
        java.lang.System.out.println("end Method");
    }
    public void bottom(){
        end();
    }
    public static void bottom1(){
        end();

    }
    public static void main(String args[]){
        bottom1();
        SampleMethod1 s1object=new SampleMethod1();
        s1object.bottom();
    }
}
