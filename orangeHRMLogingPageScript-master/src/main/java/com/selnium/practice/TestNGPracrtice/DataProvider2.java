package com.selnium.practice.TestNGPracrtice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.annotations.DataProvider;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class DataProvider2 {
    WebDriver driver;
    WebDriverWait explicitWait;

    @BeforeMethod
    public void setUp(){
        driver =new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        explicitWait=new WebDriverWait(driver,Duration.ofSeconds(10));

    }

    @Test(dataProvider = "loginData")
    public void loginPage(String UserName,String Password) throws InterruptedException {


        String actual_title = driver.getTitle();
        String expTitle = "OrangeHRM";
        assertEquals(actual_title, expTitle, "title is not matched");
        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        userName.click();
        userName.sendKeys(UserName);
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.click();
        password.sendKeys(Password);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(normalize-space(),'Login')]")).click();
        Thread.sleep(1000);

    }
    @DataProvider(name= "loginData")
    public Object[][] loginTestData(){
        Object[][] obj=new Object[3][2];
        obj[0][0]="Admin";
        obj[0][1]="admin123";
        obj[1][0]="admin";
        obj[1][1]="test";
        obj[2][0]="test@123";
        obj[2][1]="Test234";
        return obj;

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
