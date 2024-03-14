package com.practice.com;

public class CharOccurrence {
    public static void charOcc(){
        String s="Hello world Hello world";
        int len=s.length();
        int afterRemoveSpace=  s.replace("l","").length();
        int c=len-afterRemoveSpace;
        System.out.println(c);




    }

    public static void main(String[] args) {
        charOcc();
    }



}
