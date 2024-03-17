package com.selnium.practice.TestNGPracrtice;

import com.selnium.practice.TestData;
import com.selnium.practice.XpathClass;

public class LoginOrangeHRM {
    org.openqa.selenium.WebDriver driver;

    @ org.testng.annotations.BeforeClass
    public void Prerequisites() {
        driver = new org.openqa.selenium.chrome.ChromeDriver();
        driver.get(XpathClass.orangeHRM_URL);
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @org.testng.annotations.Test(priority = 1)

    public void login(){

        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.userNameXPath)).sendKeys(TestData.UserName);
       driver.findElement(org.openqa.selenium.By.xpath(XpathClass.passwordXpath)).sendKeys(TestData.password);
        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.loginButtonXpath)).click();

    }

    @org.testng.annotations.AfterClass
    public void tearDown(){

        driver.quit();
    }






}
