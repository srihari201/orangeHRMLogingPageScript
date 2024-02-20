package com.selnium.practice;


import java.util.ArrayList;

public class HandlingWindows1 extends BaseClass {
    LoginHRM lr;
    public void init() throws InterruptedException {
        enterUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.link1Xpath)).click();
    }
    public void handlingWindow() throws InterruptedException {
        //Capture id's for windows
        java.util.Set<String> windows=driver.getWindowHandles();
        //Converting to set
        java.util.List<String> windowIDsList  =new java.util.ArrayList(windows);


        String parentWindow= windowIDsList.get(0);
        String childWindow=windowIDsList.get(1);

        //Switch to child window
        driver.switchTo().window(childWindow);
        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.contactSaleXpath)).click();
        //Switch to Parent window
        driver.switchTo().window(parentWindow);
        lr=new LoginHRM();
        lr.login();


    }

    public static void main(String[] args) throws InterruptedException {
        HandlingWindows1 ref=new HandlingWindows1();
        ref.init();
        ref.handlingWindow();
    }
}
