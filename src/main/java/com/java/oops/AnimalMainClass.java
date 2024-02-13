package com.java.oops;

public class AnimalMainClass {
    public static void main(String[] args) {
        System.out.println("Execution will be started from main method\n");
        Animal an=new Animal( "Crocodile", "Green",9, 6.8);
        an.methodToDisplayInfo();
        System.out.println();
        Animal an1= new Animal("Elephant","Brown",8,6.9);
        an1.methodToDisplayInfo();
        System.out.println();
        System.out.println("Execution will be ended");
    }
}
