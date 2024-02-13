package com.qa.pracrticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserCommands {
    static  WebDriver driver;
    static String BrowserURLLoginPage="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    static String BrowserURL2="https://www.orangehrm.com/";

    public static void main (String args[]) throws InterruptedException {
        System.out.println("the execution will start from main method ");
        driver=new ChromeDriver();
        driver.get(BrowserURLLoginPage);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(1000);
        // driver.close();// it will close the current window
        driver.findElement(By.xpath("//a[contains(normalize-space(),'OrangeHRM')]")).click();
        Thread.sleep(1000);
        driver.quit();




    }
}
