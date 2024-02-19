package com.java.oops.keywordsAndstatement.java;

public class SuperKeyword2 {
    int a=25;

}
 class SuperKeyword3 extends  SuperKeyword2{
    int a=35;
     SuperKeyword3(){
         System.out.println("SuperKeyword3 constructor");
         System.out.println(a);
         System.out.println(super.a);

     }

     public static void main(String[] args) {
         System.out.println("Execution will be started from main method by JVM");
         SuperKeyword3 ref=new SuperKeyword3();

         System.out.println("Execution will be ended");
     }

}
