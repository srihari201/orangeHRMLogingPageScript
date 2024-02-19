package com.selnium.practice;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseClass {
    org.openqa.selenium.WebDriver driver;
    public BaseClass(){
        driver=new ChromeDriver();

    }


    // Method to navigate to a URL
    public void enterUrl(String url) {

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }



    // Method to close the browser
    protected void closeBrowser() {

        driver.quit();
    }
}