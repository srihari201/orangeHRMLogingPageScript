package com.selnium.practice.TestNGPracrtice;

import org.openqa.selenium. *;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

import static org.testng.Assert.*;
@Test(groups = {"All"})

public class OrangeHRMLoginInvalidCredentials {
    WebDriver driver;
    WebDriverWait explicitWait;
    @BeforeClass(groups ={"Smoke","Sanity","Regression"})
    public void initializePreconditions() {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @Test(groups={"Smoke","Sanity","Functional","Regression"})
    public void process() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.xpath("//button[contains(normalize-space(),'Login')]")).click();
        explicitWait=new WebDriverWait(driver,Duration.ofSeconds(10));
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));

        //Colour code webElement
        WebElement usernameInput=  driver.findElement(By.xpath("//input[@name='username']"));
        // Get the actual border color
        String actualBorder = usernameInput.getCssValue("border-color");
        System.out.println("Actual border color: " + actualBorder);
        // Verify that the border color contains the expected color
        assertTrue(actualBorder.contains("rgb(235, 9, 16)"), "Border color is not as expected");

        //error message validation
        String errorMessage=driver.findElement(By.xpath("//div[@class='orangehrm-login-form']//div[2]//div[1]//span[1]")).getText();
        System.out.println(errorMessage);
        assertTrue(errorMessage.contains("Required"));

        //URL Validation
        String actualURl= driver.getCurrentUrl();
        assertTrue(actualURl.contains("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));

        //Title validation
        String actualTitle=driver.getTitle();
        assertEquals(actualTitle,"OrangeHRM","Title is not matching");

    }

    @AfterClass(groups = {"Smoke","Sanity","Regression"})
    public void tearDown(){
        driver.quit();

    }

}
