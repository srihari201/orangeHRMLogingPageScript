package com.qa.pracrticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ConditionalMethods {
    static  WebDriver driver;
    static String BrowserURL="https://demo.nopcommerce.com/";

    public static void main (String args[]) throws InterruptedException {
        System.out.println("Execution will start from main method");
        driver=new ChromeDriver();
        driver.get(BrowserURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Boolean img= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        System.out.println("Image availability" + img);
        WebElement Register_Link=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
        Register_Link.click();
        Thread.sleep(1000);
        WebElement Male_rdbtn= driver.findElement(By.xpath("//input[contains(@id,'gender-male')]"));
        WebElement Female_rdbtn= driver.findElement(By.xpath("//input[contains(@id,'gender-female')]"));
        System.out.println("Before selecting the Radio buttons............");
        System.out.println(Male_rdbtn.isSelected());
        System.out.println(Female_rdbtn.isSelected());
        System.out.println("After selecting the Radio buttons..............");
        Male_rdbtn.click();
        System.out.println(Male_rdbtn.isSelected());
        Female_rdbtn.click();
        System.out.println(Female_rdbtn.isSelected());

        System.out.println("execution is completed");








    }
}
