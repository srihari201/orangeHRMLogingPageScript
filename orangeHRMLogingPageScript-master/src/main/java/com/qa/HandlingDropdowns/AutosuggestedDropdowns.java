package com.qa.HandlingDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutosuggestedDropdowns {
    static WebDriver driver;
    static String URL="https://www.google.com/";
    public static void main(String args[]) throws InterruptedException {
        System.out.println("Execution will be started from main method");
        driver=new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement searchBar= driver.findElement(By.cssSelector("textarea#APjFqb"));
        searchBar.click();
        searchBar.sendKeys("Selenium");
        Thread.sleep(1000);
        List<WebElement>  listofAutosuggested=driver.findElements(By.xpath("//div[@class='wM6W7d']//span"));
        Thread.sleep(1000);
        System.out.println("\n" + "Total number of auto suggested dropdown options " +listofAutosuggested.size());

        for(int i=0;i<listofAutosuggested.size();i++){
            String getOptions=listofAutosuggested.get(i).getText();
            System.out.println(getOptions);
            if(getOptions.equals("selenium interview questions")){
                listofAutosuggested.get(i).click();
                break;
            }
        }

        System.out.println("\n"+"Execution will be ended");

    }
}
