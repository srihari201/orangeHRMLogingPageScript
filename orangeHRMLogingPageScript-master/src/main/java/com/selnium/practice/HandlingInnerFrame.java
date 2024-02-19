package com.selnium.practice;

public class HandlingInnerFrame extends BaseClass{
    public void initialization(){
        enterUrl(XpathClass.innerFrame_URL);
    }

    public void handlingInnerFrame(){
        org.openqa.selenium.WebElement frm1=driver.findElement(org.openqa.selenium.By.xpath(XpathClass.frame1));
        driver.switchTo().frame(frm1);
        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.myTextField)).sendKeys(TestData.myTextField);

    }

    public static void main(String[] args) {
        System.out.println("Execution starts from main method by JVM");
        HandlingInnerFrame hif=new HandlingInnerFrame();
        hif.initialization();
        hif.handlingInnerFrame();

        System.out.println("Execution will be ended");
    }

}
