package com.qa.HandlingDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggetionDropdownHandling2 {
    static WebDriver driver;
    static String AppURL="https://www.google.com/";
    public static void main(String args[]) throws InterruptedException {
        System.out.println("Execution will be started from main method"+"\n");
        driver=new ChromeDriver();
        driver.get(AppURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("today");
        Thread.sleep(1000);
        List<WebElement> autoSuggetionWebElements=driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]//span"));
        System.out.println(autoSuggetionWebElements.size());
        for(int i=0;i<autoSuggetionWebElements.size();i++){
            String ListOfOptions= autoSuggetionWebElements.get(i).getText();
            System.out.println(""+ListOfOptions);
            Thread.sleep(1000);
            if(ListOfOptions.equals("today gold rate")){
                autoSuggetionWebElements.get(i).click();
                break;
            }
        }




        System.out.println("Execution will be ended ");
    }
}
