package com.qa.handlingAlertes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HandlingAlerts {
    static WebDriver driver;
    static String AppURL="https://the-internet.herokuapp.com/javascript_alerts";
    public static void main(String args[]) throws InterruptedException {
        System.out.println("Execution will be started from main method"+"\n");
        driver=new ChromeDriver();
        driver.get(AppURL);
        WebDriverWait explicitWait=new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // Define the expected title for the landing page
        String expectedLandingPageTitle = "The Internet";
// Get the actual title of the landing page
        String actualLandingPageTitle = driver.getTitle();
// Print the actual title for reference
        System.out.println("Actual Landing Page Title: " + actualLandingPageTitle);
// Check if the actual title matches the expected title
        if (actualLandingPageTitle.equals(expectedLandingPageTitle)) {
            System.out.println("The title of the landing page is correct and matches the expected title.");
        } else {
            System.out.println("Warning: The actual title does not match the expected title.");
        }

        WebElement jsalertButton= driver.findElement(By.xpath("//button[contains(normalize-space(),'Click for JS Alert')]"));
        if(jsalertButton.isDisplayed() && jsalertButton.isEnabled()){
            jsalertButton.click();
        }
        else {
            System.out.println("The jsalertButton is not displayed and enabled ");
        }

        Alert alertPopup=explicitWait.until(ExpectedConditions.alertIsPresent());
        String  AlertText=alertPopup.getText();

        if(AlertText.equals("I am a JS Alert")){
            System.out.println("Success! The alert message is as expected.");
        } else {
            System.out.println("Error! The alert message is not as expected.");
        }
        alertPopup.accept();

        WebElement successmsgElement= driver.findElement(By.xpath("//p[contains(normalize-space(),'You')]"));
        String  Successmsg= successmsgElement.getText();
        if(Successmsg.equals("You successfully clicked an alert")){
            System.out.println("Success! The result message is as expected.");
        } else {
            System.out.println("Error! The result message is not as expected.");
        }

        WebElement thirdButton=explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(normalize-space(),'Click for JS Prompt')]")));
        String thirdButtonInnerText=thirdButton.getText();
        System.out.println(thirdButtonInnerText);

        if(thirdButtonInnerText.equals("Click for JS Prompt") && thirdButton.isEnabled()){
            thirdButton.click();

        }
        Alert alert2=    explicitWait.until(ExpectedConditions.alertIsPresent());
        String header= alert2.getText();
        System.out.println(header);
        alert2.sendKeys("Text");
        alert2.accept();



        System.out.println("Execution will be ended ");
    }
}
