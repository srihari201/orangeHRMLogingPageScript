package com.qa.Strings;

public class concatMethod {
    public static void  main(java.lang.String args[]){
        System.out.println("Execution will be started from main method");
        String s=new String("Happy New Year");
        String s1=new String ("2024");
        //System.out.println(s.length());
        int totalLengthOfString=   s.length();
        System.out.println(totalLengthOfString);

       String concatenatingString=s.concat(s1);
       System.out.println(concatenatingString);

        System.out.println("Execution will be ended");
    }
}
