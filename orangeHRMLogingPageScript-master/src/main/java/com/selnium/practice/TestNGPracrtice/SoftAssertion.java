package com.selnium.practice.TestNGPracrtice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SoftAssertion {
    WebDriver driver;
    @BeforeClass
    public void initializePreconditions(){
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }
    @Test
    public void process() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.xpath("//button[contains(normalize-space(),'Login')]")).click();
        WebDriverWait explicitWait=new WebDriverWait(driver,Duration.ofSeconds(10));
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));

        SoftAssert sa=new SoftAssert();
        //Colour code webElement
        WebElement usernameInput=  driver.findElement(By.xpath("//input[@name='username']"));
        // Get the actual border color
        String actualBorder = usernameInput.getCssValue("border-color");
        System.out.println("Actual border color: " + actualBorder);
        // Verify that the border color contains the expected color
        sa.assertTrue(actualBorder.contains("rgb(235, 9, 16)"), "Border color is not as expected");

        //error message validation
        String errorMessage=driver.findElement(By.xpath("//div[@class='orangehrm-login-form']//div[2]//div[1]//span[1]")).getText();
        System.out.println(errorMessage);
        sa. assertTrue(errorMessage.contains("Requiredd"));

        //URL Validation
        String actualURl= driver.getCurrentUrl();
        sa. assertTrue(actualURl.contains("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));

        //Title validation
        String actualTitle=driver.getTitle();
        sa. assertEquals(actualTitle,"OrangeHRM","Title is not matching");
        System.out.println(".......................");
        sa.assertAll();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();

    }

}
