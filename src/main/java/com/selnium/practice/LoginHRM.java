package com.selnium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginHRM {
    public static void main(String[] args) throws InterruptedException {
        OrangeHRMTestData ref=new OrangeHRMTestData();


        WebDriver driver = new ChromeDriver();
        driver.get(OrangeHRMXpathClass.orangeHRM_URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // new way of defining the implicitly wait

        System.out.println("....url validation once the user logged into the application....");
        String actual_currentUrl=  driver.getCurrentUrl();
        System.out.println("Actual URL is " + actual_currentUrl);
        if(OrangeHRMXpathClass.orangeHRM_URL.equals(actual_currentUrl)){
            System.out.println("The url is matched");
        }
        else{
            System.out.println("The url is not matched");
        }

        driver.findElement(By.xpath(OrangeHRMXpathClass.userNameXPath)).clear();
        driver.findElement(By.xpath(OrangeHRMXpathClass.userNameXPath)).sendKeys(ref.UserName);
        driver.findElement(By.xpath(OrangeHRMXpathClass.passwordXpath)).sendKeys(ref.password);
        driver.findElement(By.xpath(OrangeHRMXpathClass.loginButtonXpath)).click();
        System.out.println();

        Thread.sleep(50000);
        System.out.println(".....title of the dashboard validation after logging in to the application..... ");
        String actual_title=driver.getTitle();
        System.out.println("Actual title is " + actual_title);
        String expected_title="OrangeHRM";
        if(actual_title.equals(expected_title) ){
            System.out.println("The title is matched ");
        }
        else {
            System.out.println("The landing page of the title is not matched");
        }
        System.out.println();

        System.out.println("......Label validation after logging in to the application...... ");
        String actual_labelText=  driver.findElement(By.xpath(OrangeHRMXpathClass.dashBoardLabelXpath)).getText();
        System.out.println("Actual label text is " + actual_labelText);
        String expected_labelText="Dashboard";
        if(actual_labelText.equals(expected_labelText)){
            System.out.println("The label text is matched");
        }
        else{
            System.out.println("The label text is not matched");
        }

        driver.quit();


    }
}