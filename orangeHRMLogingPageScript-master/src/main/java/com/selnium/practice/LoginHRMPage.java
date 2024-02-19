package com.selnium.practice;



public class LoginHRMPage extends BaseClass{
    public void preReq(){
        enterUrl(XpathClass.orangeHRM_URL);

    }

    public static void main(String[] args) {
        System.out.println("Execution starts from main method by JVM");
        LoginHRMPage lrm=new LoginHRMPage();
        lrm.preReq();


    }
}
