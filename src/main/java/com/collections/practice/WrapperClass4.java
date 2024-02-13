package com.collections.practice;

public class WrapperClass4 {
    public static void main(String[] args) {


        //String to int conversion
        String s = "10";
        String s1 = "15";

        System.out.println("Before converting String to int " + s+s1);

        int value= Integer.parseInt(s)+Integer.parseInt(s1);
        System.out.println("After converting String to int " + value);
        System.out.println();

        //int to String Conversion
        int x=10;
        int y=20;
        System.out.println("Before converting int to String " + (x+y));
        System.out.println("After converting int to String " + String.valueOf(x)+String.valueOf(y));

    }

}