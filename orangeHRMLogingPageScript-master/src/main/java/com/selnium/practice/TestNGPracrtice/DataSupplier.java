package com.selnium.practice.TestNGPracrtice;

import org.testng.annotations.DataProvider;

public class DataSupplier {
    @DataProvider
    public Object[][] data(){
        Object[][] obj=new Object[2][2];
        System.out.println(obj);
        System.out.println(obj.length);
        obj[0][0]="Admin";
        obj[0][1]="admin123";
        obj[1][0]="admin@1234";
        obj[1][1]="test@123";
        return obj;

    }

    @DataProvider
    public Object[][] data2(){
        Object[][] obj=new Object[2][2];
        System.out.println(obj);
        System.out.println(obj.length);
        obj[0][0]="Admin";
        obj[0][1]="admin123";
        obj[1][0]="admin@1234";
        obj[1][1]="test@123";
        return obj;

    }


}
