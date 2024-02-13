package com.qa.handlingAlertes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AuthenticatorAlert {
    static WebDriver driver;
    static  String URL="https://admin:admin@the-internet.herokuapp.com/basic_auth";

    public static void main(String args[]){
        System.out.println("Execution will be started from main method");
        driver=new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        WebDriverWait explicitWait=new WebDriverWait(driver, Duration.ofSeconds(10));
        String successmsg= explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(normalize-space(),'Congratulations!')] "))).getText();
        if(successmsg.equals("Congratulations! You must have the proper credentials.")){
            System.out.println("Success: The authentication has successfully completed");


        }
        else{
            System.out.println("Warning: The authentication has failed ");
        }








    }
}
