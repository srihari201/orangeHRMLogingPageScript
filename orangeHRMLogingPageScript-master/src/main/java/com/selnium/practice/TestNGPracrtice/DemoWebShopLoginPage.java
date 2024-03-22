package com.selnium.practice.TestNGPracrtice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;

import java.time.Duration;

public class DemoWebShopLoginPage {
    WebDriver driver;
    @BeforeClass(groups = {"Smoke","Sanity","Regression"})
    public void demoWebShopSetUpLogin(){
        driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }
    @Test(groups = {"Smoke","Sanity"})
    public void demoWebShop1(){
        System.out.println("DemoWebShop1");
    }
    @Test(groups = {"Smoke","Sanity","functional","Regression"})
    public void  DemoWebShopTestLoginWithValidCredentials(){
        driver.findElement(By.xpath("//a[contains(normalize-space(),'Log in')]")).click();
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("srihari.adada@kanini.com");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Srihari@demo");
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
    }
    @Test(groups = {"functional", "Regression"})
    public void DemoWebShop2(){
        System.out.println("DemoWebShop2");
    }
    @AfterClass(groups = {"Smoke","Sanity","Regression"})
    public void demoWebShopTearDown(){
        driver.quit();

    }


}
