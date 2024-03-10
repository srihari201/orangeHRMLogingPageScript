package com.selnium.practice.TestNGPracrtice;

public class FirstTCTestNG {
    @ org.testng.annotations.Test(priority = 1)
    public void a(){
        System.out.println("Method a started");
    }
    @org.testng.annotations.Test(priority = 2)
    public void b(){
        System.out.println("Method b started");
    }
    @org.testng.annotations.Test(priority =3)
    public void c()
    {
        System.out.println("Method c started");
    }




}
