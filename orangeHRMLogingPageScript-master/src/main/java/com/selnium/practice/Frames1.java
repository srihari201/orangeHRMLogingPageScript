package com.selnium.practice;

import org.openqa.selenium.WebElement;

public class Frames1 extends BaseClass{
    public void preReq(){
        enterUrl(XpathClass.frames_URL);

    }
    public void handlingFrames(){
        driver.switchTo().frame("frame1");
        String frame1Text=   driver.findElement(org.openqa.selenium.By.id("sampleHeading")).getText();
        java.lang.System.out.println(frame1Text);
    }

    public static void main(java.lang.String[] args){
        java.lang.System.out.println("Execution starts from main method by JVM");
        Frames1 f1=new Frames1();
        f1.preReq();
        f1.handlingFrames();


        java.lang.System.out.println("Execution will be ended");

    }
}
