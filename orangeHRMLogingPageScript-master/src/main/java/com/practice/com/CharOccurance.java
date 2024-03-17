package com.practice.com;

public class CharOccurance {
    public static void main(String[] args) {
        String s="Hello world";
        char ch='l';
        int count =0;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                count++;
            }

        }
        System.out.println(count);
    }
}
