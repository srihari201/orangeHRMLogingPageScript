package com.qa.waits;

import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ImplicitlyWait {
    static WebDriver driver;
    static String URL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";


    public static void main (String args[]){
        System.out.println("Execution will start from main method");
        driver=new ChromeDriver();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // new way of defining the implicitly wait
        //  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); Traditional way of defining implicitly wait
        String CurrentURL=driver.getCurrentUrl();
        String ExpectedURL= URL;
        if(CurrentURL.equals(ExpectedURL)){
            System.out.println("URL Validation is passed : The current URL is " + CurrentURL);
        }
        else {
            System.out.println("URL Validation is failed : The current URL is " + CurrentURL + "The ExpectedURL is " + ExpectedURL);
        }

        driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active'][@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active'][@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[contains(normalize-space(),'Login')]")).click();
        String ActualWebPageTitle= driver.getTitle();
        String ExpectedTitle="OrangeHRM";
        if(ActualWebPageTitle.equals(ActualWebPageTitle)){
            System.out.println("The Validation is passed for the Title: The current title is " + ActualWebPageTitle);
        }
        else{
            System.out.println("The Validation is failed for the title: The current title is " + ActualWebPageTitle + "The ExpectedTitle is " + ExpectedTitle);
        }
        driver.close();

    }
}
