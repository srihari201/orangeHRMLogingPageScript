package com.qa.pracrticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PractiveXpathOrangeHRM {
    static String BrowserURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    static String UserName="Admin";
    static String DashboardTitlExpected="";
    public static void main(String args[]){
        String Password="admin123";

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(PractiveXpathOrangeHRM.BrowserURL);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[contains(@name,'username')]")).click();
        driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys(UserName);
        driver.findElement(By.xpath("//input[contains(@name,'password')]")).click();
      //  driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys(Password);
        driver.findElement(By.xpath("//input[@name='password']/parent::div]")).sendKeys(Password);

       // //input[@name='password']/parent::div
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
        String ActualTitleOfDashboard=driver.getTitle();
        String ExpectedTitleOfDashboard="OrangeHRM";
        String ExpectedLabelOfDashboard="Dashboard";
        String ActualLabelOfDashboard = driver.findElement(By.xpath("//h6[contains(normalize-space(),'Dashboard')]")).getText();
        System.out.println(ActualLabelOfDashboard);
        if(ActualLabelOfDashboard.equals(ExpectedLabelOfDashboard)){
            System.out.println("The expected label is " +ExpectedLabelOfDashboard);
        }
        else {
            System.out.println("The actual label is " + ActualLabelOfDashboard);
        }

        if (ExpectedTitleOfDashboard.equals(ActualTitleOfDashboard)) {
            System.out.println("The expected title is " +ExpectedTitleOfDashboard);
        }
        else {
            System.out.println("The actual title is " +ActualTitleOfDashboard);
        }

        driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Admin']")).click();
        //span[contains(normalize-space(),'Admin') and @class='oxd-text oxd-text--span oxd-main-menu-item--name']





    }
}
