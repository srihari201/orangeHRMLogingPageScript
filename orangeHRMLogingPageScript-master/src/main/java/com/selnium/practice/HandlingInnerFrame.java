package com.selnium.practice;

public class HandlingInnerFrame extends BaseClass{
    public void initialization(){
        enterUrl(XpathClass.innerFrame_URL);
    }

    public void handlingInnerFrame(){
        //Switching to the frame using WebElement
        org.openqa.selenium.WebElement frm1=driver.findElement(org.openqa.selenium.By.xpath(XpathClass.frame1));
        driver.switchTo().frame(frm1);
        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.myTextField1)).sendKeys(TestData.myTextField);

        //Switch to default page
        driver.switchTo().defaultContent();

        //Switch to the third frame using WebElement
        org.openqa.selenium.WebElement frm3=driver.findElement(org.openqa.selenium.By.xpath(XpathClass.frame3));
        driver.switchTo().frame(frm3);
        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.myTextField3)).sendKeys(TestData.myTextField3);
        //Switching to Inner frame
        driver.switchTo().frame(0);
        driver.findElement(org.openqa.selenium.By.cssSelector(XpathClass.radioBtnCss)).click();
        driver.switchTo().defaultContent();
    }

    public static void main(String[] args) {
        System.out.println("Execution starts from main method by JVM");
        HandlingInnerFrame hif=new HandlingInnerFrame();
        hif.initialization();
        hif.handlingInnerFrame();
        System.out.println("Execution will be ended");
    }

}
