package com.java.oops.constructors.java;

import java.sql.SQLOutput;

public class ConstructorTV {
    String Color;
    double price;
    String brand;
    String shape;
    String weight;
    String quality;
    public  ConstructorTV(){
        Color="Black";
        price=10000;
        brand="Samsung";
        shape="Rectangle";
        weight="4KG";
        quality="Low";


    }

    public static void main(String args[]){
        ConstructorTV ct=new ConstructorTV();
        System.out.println(ct.Color);
        System.out.println(ct.price);
        System.out.println(ct.brand);
        System.out.println(ct.shape);
        System.out.println(ct.weight);
        System.out.println(ct.quality);


    }
}
