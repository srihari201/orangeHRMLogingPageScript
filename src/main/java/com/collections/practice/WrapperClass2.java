package com.collections.practice;

public class WrapperClass2 {
    byte b=10;
    short s=20;
    int i=30;
    long l=40;
    float f=50.5f;
    double d=60;
    char c='c';
    boolean b1=true;

    public  void convertPrimitiveToWrapperObject(){
        java.lang.Byte byteObject=b;
        java.lang.Short shortObject=s;
        java.lang.Integer integerObject=i;
        java.lang.Long longObject=l;
        java.lang.Float floatObject=f;
        java.lang.Double doubleObject=d;
        java.lang.Character charObject=c;
        java.lang.Boolean booleanObject=b1;
        java.lang.System.out.println(byteObject);
        java.lang.System.out.println(shortObject);
        java.lang.System.out.println(integerObject);
        java.lang.System.out.println(longObject);
        java.lang.System.out.println(floatObject);
        java.lang.System.out.println(doubleObject);
        java.lang.System.out.println(charObject);
        java.lang.System.out.println(booleanObject);


    }


    public static void main(String[] args) {
        WrapperClass2 ref=new WrapperClass2();
        ref.convertPrimitiveToWrapperObject();

    }
}
