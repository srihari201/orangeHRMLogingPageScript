package com.practice.com;

public class ReverseNumber1
{
    public static int  reverse(int num,int rev){


        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;


        }
        return rev;


    }

    public static void main(String[] args) {
        int re=  reverse(1234,0);
        System.out.println(re);


    }
}
