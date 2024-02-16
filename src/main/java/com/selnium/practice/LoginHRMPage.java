package com.selnium.practice;



public class LoginHRMPage extends BaseClass{
    public void preReq(){
        enterUrl(XpathClass.orangeHRM_URL);

    }

    public static void main(String[] args) {
        LoginHRMPage lrm=new LoginHRMPage();
        lrm.preReq();


    }
}
