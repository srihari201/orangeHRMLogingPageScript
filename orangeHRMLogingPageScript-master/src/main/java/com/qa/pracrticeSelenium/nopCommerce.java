package com.qa.pracrticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class nopCommerce {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(6000);
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("a.ico-register")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input#gender-male")).click();
        driver.findElement((By.cssSelector("input#FirstName"))).sendKeys("Srihari");
        driver.findElement(By.cssSelector("input#LastName")).sendKeys("Adada");
        Select Date = new Select(driver.findElement(By.cssSelector("select[name='DateOfBirthDay']")));
        Date.selectByIndex(3);
        Thread.sleep(3000);
        Select Month=new Select(driver.findElement(By.cssSelector("select[name='DateOfBirthMonth']")));
        Month.selectByIndex(4);
        Thread.sleep(3000);
        Select Year=new Select(driver.findElement(By.cssSelector("select[name='DateOfBirthYear']")));
        Year.selectByIndex(3);
        Thread.sleep(5000);
        String userName = ""+(int)(Math.random()*Integer.MAX_VALUE);
        String emailID = "User"+userName+"@example.com";
        System.out.println(emailID);
        Thread.sleep(10000);
        try {
            driver.findElement(By.cssSelector("input.input-validation-error")).sendKeys(emailID);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}


