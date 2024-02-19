package com.qa.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {
        System.out.println("Execution will start from main method");
        WebDriver driver = new ChromeDriver();
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement UsernameAttribute= explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Username : Admin']")));
        String InnerTextOfUN=UsernameAttribute.getText();
        System.out.println(InnerTextOfUN);
        WebElement userName=explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        userName.click();
        userName.sendKeys("Admin");
        WebElement password= explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
        password.click();
        password.sendKeys("admin123");
        WebElement loginbtn=explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
        loginbtn.click();

    }
}
