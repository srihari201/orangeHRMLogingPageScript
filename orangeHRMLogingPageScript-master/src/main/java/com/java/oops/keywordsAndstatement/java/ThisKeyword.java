package com.java.oops.keywordsAndstatement.java;

public class ThisKeyword {
    int a;
    int b;
    public void method1(int a, int b){
        this. a=a;
        this. b=b;
        System.out.println(a);
        System.out.println(b);


    }
    public void method2(int x, int y){
        System.out.println(x);
        System.out.println(y);

    }

    public static void main(String[] args) {
        ThisKeyword tw=new ThisKeyword();
        tw.method1(1,2);
        tw.method2(2,2);

    }

}
