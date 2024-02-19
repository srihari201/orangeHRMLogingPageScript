package com.qa.HandlingDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class BootstrapDropdowns {
    static WebDriver driver;

    public static void main(String args[]) throws InterruptedException {
        System.out.println(".....Execution will be started from main method........");
        driver = new ChromeDriver();
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Clicking on the Bootstrap dropdown
        WebElement bootStrapDropdown = driver.findElement(By.xpath("//span[contains(@class,classmultiselect)][normalize-space()='HTML, CSS']"));
        bootStrapDropdown.click();
        //getting the list of dropdowns
        List<WebElement> bootStrapDropdownOptions = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label" +"\n"));
        System.out.println("\n"+"Total Number of available options in bootstrap dropdown" + bootStrapDropdownOptions.size() +"\n");

        //Printing all the Options of the dropdown
        for(int i=0;i<bootStrapDropdownOptions.size();i++)
        {
            System.out.println(bootStrapDropdownOptions.get(i).getText());

        }
        for (int i = 0; i < bootStrapDropdownOptions.size(); i++) {
            String optionText = bootStrapDropdownOptions.get(i).getText();

            if (optionText.equals("Java")) {
                bootStrapDropdownOptions.get(i).click();
            } else if (optionText.equals("Angular")) {
                bootStrapDropdownOptions.get(i).click();
            } else if (optionText.equals("MySQL") || optionText.equals("Oracle")) {
                bootStrapDropdownOptions.get(i).click();
            }
        }
        

    }}

