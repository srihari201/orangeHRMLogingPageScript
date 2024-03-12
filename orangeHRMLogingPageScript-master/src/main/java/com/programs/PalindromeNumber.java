package com.programs;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num=121;
        int  rev=0;
        int  org=121;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;


        }

        if(org==rev){
            System.out.println("The given number is palindrome " +org);
        }else{
            System.out.println("The given number is not palindrome ");
        }






    }

}
