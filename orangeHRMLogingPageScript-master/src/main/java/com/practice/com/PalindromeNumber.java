package com.practice.com;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num =121;
        int org_num=121;
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;

        }
        System.out.println("before reverse the number " + num);
        System.out.println("after reverse the number " + rev);
        if(rev==org_num){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not a palindrome ");
        }
    }
}
