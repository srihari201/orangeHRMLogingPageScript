package com.qa.Strings;

public class ImportantMethodSingleString {
    public static void main(String[] args) {
        String s=new String("Hello world");
        System.out.println(s.length());//11
        System.out.println(s.charAt(4));//o
        System.out.println(s.contains("He"));//True
        System.out.println(s.substring(3));//lo world
        System.out.println(s.substring(3,6).length());//lo

    }
}

