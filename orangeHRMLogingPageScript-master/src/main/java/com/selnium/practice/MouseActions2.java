package com.selnium.practice;

public class MouseActions2 extends BaseClass{
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

    public void handlingMouseActions(){
        org.openqa.selenium.WebElement electronics= driver.findElement(org.openqa.selenium.By.xpath(XpathClass.electronicsTopElementXpath));
        org.openqa.selenium.WebElement cameraPhoto=driver.findElement(org.openqa.selenium.By.xpath(XpathClass.cameraPhotoXpath));

        org.openqa.selenium.interactions.Actions ae=new org.openqa.selenium.interactions.Actions(driver);
        ae.moveToElement(electronics).moveToElement(cameraPhoto).click().perform();
    }


    public static void main(String[] args) throws InterruptedException {
        MouseActions2 ref=new MouseActions2();
        ref.init();
        ref.login();
        ref.handlingMouseActions();
    }
}
