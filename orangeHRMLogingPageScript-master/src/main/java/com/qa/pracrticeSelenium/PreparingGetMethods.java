package com.qa.pracrticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class PreparingGetMethods {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());
        String ExpectedTitleOfLandingPage="OrangeHRM";
        if(ExpectedTitleOfLandingPage.equals(driver.getTitle())){
            System.out.println("The current URL is correct");
        }
        else{
            System.out.println("The Current URL is not correct");
        }

        String Window= driver.getWindowHandle();
        System.out.println(Window);
        driver.findElement(By.xpath("//a[contains(normalize-space(),'OrangeHRM')]")).click();
        Set<String> Windowids= driver.getWindowHandles();
        for (String win:Windowids){
            System.out.println(win);
        }
    }}