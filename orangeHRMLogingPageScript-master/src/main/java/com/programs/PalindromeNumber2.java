package com.programs;

public class PalindromeNumber2 {
    public static void main(String[] args) {
        int num=131;
        System.out.println("Before reverse the number is " + num);
        StringBuilder sb=new StringBuilder();
        sb.append(num);
        StringBuilder rev=sb.reverse();

    }
}
