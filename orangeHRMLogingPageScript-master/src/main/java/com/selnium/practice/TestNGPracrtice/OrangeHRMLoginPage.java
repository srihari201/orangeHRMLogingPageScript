package com.selnium.practice.TestNGPracrtice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoWebShotLogin {
    WebDriver driver;

    @BeforeClass
    public void setUpLoginPage(){
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @Test
    public void testLoginWithValidCredentials(){
        WebElement userName=driver.findElement(By.xpath("//input[@name='username']"));
        userName.click();
        userName.sendKeys("Admin");
        WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
        password.click();
        password.sendKeys("admin123");
    }
    @AfterClass
    public void tearDownLogout(){
        driver.quit();
    }

}
