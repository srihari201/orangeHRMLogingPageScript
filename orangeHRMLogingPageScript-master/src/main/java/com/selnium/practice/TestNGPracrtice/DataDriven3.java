package com.selnium.practice.TestNGPracrtice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class DataDriven3 {
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

    @Test(dataProvider = "Logindata")
    public void loginTestData(String un, String pwd) throws InterruptedException {
        String actual_title = driver.getTitle();
        String expTitle = "OrangeHRM";
        assertEquals(actual_title, expTitle, "title is not matched");
        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        userName.click();
        userName.sendKeys(un);
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.click();
        password.sendKeys(pwd);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(normalize-space(),'Login')]")).click();
        Thread.sleep(1000);

    }




    @DataProvider(name="Logindata")

    public Object[][] testData()
    {
        Object[][] obj={{"Admin","Admin123"},
                {"Test","Test123"}};
        return obj;
    }
}
