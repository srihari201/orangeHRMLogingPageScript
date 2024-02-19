package com.java.oops;

public class Animal {
    String name;
    String color;
    int age;
    double lengthFeet;

    public  Animal(String aName,String aColor, int aAge,double aLengthFeet){
        name=aName;
        color=aColor;
        age=aAge;
        lengthFeet=aLengthFeet;

    }
    public void methodToDisplayInfo() {
        System.out.println("\nAnimal Color is: " + name + "\nAnimal Color is: " + color + "\nAnimal age is: " + age + "\nAnimal Length is:" + lengthFeet);
    }

}
