package com.java.oops.encapsulation.java;

public class Encapsulation1
{

    public void setB(int i) {
        this.i = i;
    }

    public int getB() {
        return i;
    }

    public String getterSetter(String s1){
        this.s1=s1;
        return s1;
    }




    private byte b;
    private  short s;
    private int i;
    private double d;
    private String s1;

    public static void main(String[] args) {
        Encapsulation1 e1=new Encapsulation1();
        e1.setB(100);
        System.out.println(e1.getB());
        /*String re= e1.getterSetter("Hanuman");
        System.out.println(re);*/

    }

}
