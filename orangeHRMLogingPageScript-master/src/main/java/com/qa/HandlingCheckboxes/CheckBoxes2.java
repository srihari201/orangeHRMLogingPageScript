package com.qa.HandlingCheckboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class CheckBoxes2 {
    static   WebDriver driver;
    public static void main(String args[]) throws InterruptedException {
        System.out.println("Execution will start from main method");
        driver=new ChromeDriver();
        WebDriverWait explicitWait= new WebDriverWait(driver, Duration.ofSeconds(10) );
        //Selecting all the checkboxes
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        List< WebElement > CheckboxesCount =explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@class='form-check-input'][@type='checkbox']")));
        /*for(int i=0;i<CheckboxesCount.size();i++) {
            CheckboxesCount.get(i).click();
        }*/

        //Selecting First three checkboxes
        for(int i=0;i<3;i++){
            CheckboxesCount.get(i).click();
        }

        Thread.sleep(5000);
        //DeSelecting first three check boxes
        for (int i=0;i<CheckboxesCount.size();i++){
            if(CheckboxesCount.get(i).isSelected())
                CheckboxesCount.get(i).click();
        }

        System.out.println("Execution will be ended");
    }
}
