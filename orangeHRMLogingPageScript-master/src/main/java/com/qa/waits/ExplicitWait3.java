package com.qa.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait3 {
    public static void main(String[] args) {
        System.out.println("Execution will start from main method");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        WebDriverWait myExplicitWait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        myExplicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Email']"))).sendKeys("srihariadada19978@gmail.com");
        myExplicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Password']"))).sendKeys("Srihari@123");
        myExplicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Log in']"))).click();




    }
}
