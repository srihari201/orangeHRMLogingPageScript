package com.qa.HandlingDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SelectClassDropdowns {
    WebDriver driver;
    String URL="https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/";


    public static void main(String args[]) throws InterruptedException {
        System.out.println("................Execution will start from manin method.............");
        SelectClassDropdowns scd=new SelectClassDropdowns();
        scd.driver=new ChromeDriver();
        scd.driver.get(scd.URL);
        scd.driver.manage().window().maximize();
        WebDriverWait myexplicitWait=new WebDriverWait(scd.driver, Duration.ofSeconds(10));
        WebElement coutryDropdown= myexplicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='country-list']")));
        Select s=new Select(coutryDropdown);
        s.selectByVisibleText("Brazil");
        List<WebElement> optionsOfCountryDropdown=s.getOptions();
        System.out.println("The count of the Country dropdown options is : " + optionsOfCountryDropdown.size() +"\n");

        WebElement stateDropdown= myexplicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='state-list']")));
        System.out.println("The State of state dropdown is " + stateDropdown.isSelected()+ "\n");
        Select s1=new Select(stateDropdown);
        Thread.sleep(1000);
        List<WebElement> Options= s1.getOptions();
        Thread.sleep(1000);
        System.out.println("The count of the State dropdown options is : " + Options.size());
        Thread.sleep(1000);
        stateDropdown.click();
        Thread.sleep(1000);
        s1.selectByValue("16");















    }
}
