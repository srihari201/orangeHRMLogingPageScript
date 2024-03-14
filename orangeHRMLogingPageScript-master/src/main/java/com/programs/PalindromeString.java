package com.programs;

public class PalindromeString {
    public static void main(String[] args) {
        String s="hahi";
        String rev="";
        String org="hah";

        int len=s.length();
        for(int i=len-1;i>=0;i--){
            rev=rev+s.charAt(i);

        }
        if(org.equals(rev)){
            System.out.println("The given string is palindrome");
        }
        else{
            System.out.println("The given string is not palindrome ");
        }
    }
}
