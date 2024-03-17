package com.practice.com;

public class ReverseNumber {
    public static void main(String[] args) {
        int num=1234;
        //this variable will hold the reversed number.
        int rev=0;
        // while loop is used to reverse the number. It continues until num becomes 0
        while(num!=0){
            //modulus operator(%) it  gives us reminder
            rev=rev*10+num%10;
            //Division operator(/) it  gives us quotient
            num=num/10;

        }
    }
}
