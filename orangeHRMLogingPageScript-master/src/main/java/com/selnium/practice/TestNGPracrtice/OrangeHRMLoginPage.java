package com.selnium.practice.TestNGPracrtice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

import static org.testng.Assert.*;

public class OrangeHRMLoginPage {
    WebDriver driver;
    WebDriverWait explicitWait;
    @BeforeClass
    public void setUpLoginPage() {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        explicitWait=new WebDriverWait(driver,Duration.ofSeconds(10));

    }

    @Test/*(dependsOnMethods={"setUpLoginPage"})*/
    public void testLoginWithValidCredentials() {
        //login page title validation
        String actual_title = driver.getTitle();
        String expTitle = "OrangeHRM";
        assertEquals(actual_title, expTitle, "title is not matched");


        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        userName.click();
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.click();
        password.sendKeys("admin123");
        driver.findElement(By.xpath("//button[contains(normalize-space(),'Login')]")).click();

    }

    @Test
    public void verificationOfHomePage() {

        WebElement dashboardImg=explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='client brand banner']")));
        assertTrue (dashboardImg.isDisplayed());
        //Dashboard url validation
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        assertTrue(actualURL.contains(expectedURL),"The dashboard url is not matched");

        //Dashboard title validation
        String actualTitle=driver.getTitle();
        String expectedTitle="OrangeHRM";
        assertEquals(actualTitle,expectedTitle,"title is not matched");
    }
    @AfterClass
    public void tearDownLogout() {
        driver.quit();
    }

}
