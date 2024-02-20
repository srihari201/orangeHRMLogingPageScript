package com.selnium.practice;

public class HandlingFrames1 extends BaseClass{
    public void preReq(){
        enterUrl(XpathClass.frames_URL);

    }
    public void handlingFrames(){
        //Switch to the frame1
        driver.switchTo().frame("frame1");
        //printing the text fo the frame1
        String frame1Text=   driver.findElement(org.openqa.selenium.By.id("sampleHeading")).getText();
        java.lang.System.out.println("The first frame text is: " + frame1Text);

        //Switch back to page
        driver.switchTo().defaultContent();

        //Switch to the frame2
        driver.switchTo().frame("frame2");
        String frame2Text= driver.findElement(org.openqa.selenium.By.id("sampleHeading")).getText();
        java.lang.System.out.println("The second frame text is: " +frame2Text);
    }

    public static void main(java.lang.String[] args){
        java.lang.System.out.println("Execution starts from main method by JVM");
        HandlingFrames1 f1=new HandlingFrames1();
        f1.preReq();
        f1.handlingFrames();


        java.lang.System.out.println("Execution will be ended");

    }
}
