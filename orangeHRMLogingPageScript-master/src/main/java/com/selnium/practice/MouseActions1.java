package com.selnium.practice;

import org.openqa.selenium.interactions.Actions;

public class MouseActions1 extends BaseClass{
    public void init(){
        enterUrl(XpathClass.demoWebShopURL);

    }
    public void login() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.DemoWebShopLoginBtn)).click();
        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.DemoWebShopEmailXpath)).sendKeys(TestData.EMAIL_ID);

        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.DemoWebShopPasswordXpath)).sendKeys(TestData.PASSWORD);
        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.DemoWebShopLogin)).click();
    }
    public void mouseActions(){
        org.openqa.selenium.WebElement comp=driver.findElement(org.openqa.selenium.By.xpath(XpathClass.DemoWebShopComputers));
        org.openqa.selenium.WebElement des=driver.findElement(org.openqa.selenium.By.xpath(XpathClass.DemoWebShopDesktop));
        Actions as=new Actions(driver);
        as.moveToElement(comp).moveToElement(des).click().build().perform();


    }

    public static void main(String[] args) throws InterruptedException {
        MouseActions1 ref=new MouseActions1();
        ref.init();
        ref.login();
        ref.mouseActions();

    }
}
