package com.qa.HandlingCheckboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Checkboxes1 {
    public static void main(String args[]){
        System.out.println("Execution will start from main method");{
            WebDriver driver=new ChromeDriver();
            driver.get("https://testautomationpractice.blogspot.com/");
            driver.manage().window().maximize();
            WebDriverWait myWait= new WebDriverWait(driver, Duration.ofSeconds(10));
            List<WebElement> checkboxes=   myWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@class='form-check-input'][@type='checkbox']")));
            System.out.println("Total number of checkboxes " + checkboxes.size());
            //Selecting all checkboxes using collections
            for(int i=0;i<checkboxes.size();i++){
                checkboxes.get(i).click();
            }

            //selecting all checkboxes using for each
            for(WebElement chxboxs:checkboxes){
                chxboxs.click();

            }
            //Selecting first two checkboxes using
            for(int i=0;i<3;i++){
                checkboxes.get(i).click();
            }
            //Selecting last three checkboxes using
            //Total Number of checkboxes-how many checkboxes to be selected=starting index
            //7-3=4 (Starting Index)
            for(int i=4;i<checkboxes.size();i++){
                checkboxes.get(i).click();


            }





        }
    }
}
