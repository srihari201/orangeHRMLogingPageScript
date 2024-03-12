package com.programs;

public class ReverseNumberByUsingStringBuilder {
    public static void main(String[] args) {
        int num=23456;
        System.out.println("Before Reverse the number is: " + num);
        StringBuilder sb=new StringBuilder();
        sb.append(num);
        StringBuilder rev=sb.reverse();
        System.out.println("After Reverse the number is: " + rev);
    }


}
