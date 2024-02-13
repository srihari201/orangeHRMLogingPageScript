package com.java.oops.encapsulation.java;

public class Encapsulation3 {
    private int x;
    private String s;

    public int getX() {
        return x;


    }

    public void setX(int x) {
        this.x = x;

    }

    public static void main(String[] args) {

        Encapsulation3 e3=new Encapsulation3();
        e3.setX(100);
        System.out.println(e3.getX());

    }


}



