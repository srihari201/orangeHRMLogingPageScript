package com.qa.tableHandlings;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class StaticTablesHandling3 {
    static org.openqa.selenium.WebDriver driver;
    static String appURL="https://cosmocode.io/automation-practice-webtable/";

    public static void main(String args[]){
        System.out.println("Execution will be started from main method");
        driver=new org.openqa.selenium.chrome.ChromeDriver();
        driver.get(appURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        int rows= driver.findElements(org.openqa.selenium.By.xpath("//table[@id='countries']//tr")).size();
        System.out.println("Total Number of available rows in Countries table: " + rows);

        int cols=driver.findElements(org.openqa.selenium.By.xpath("//table[@id='countries']//tr[1]//td")).size();
        System.out.println("Total Number of available columns in Countries table: " + cols +"\n");


        //Retrieving all the row and columns data using for loop
        for(int r=1;r<=rows;r++){
            for(int c=1;c<=cols;c++){
                java.lang.String rowText=  driver.findElement(By.xpath("//table[@id='countries']//tr["+r+"]//td["+c+"]")).getText();

                System.out.print(rowText + "      ");

            }
            System.out.println();
        }


        // Find all checkboxes in the first column of the table
        List<WebElement> checkboxes = driver.findElements(By.xpath("//table//tr/td[1]//input[@type='checkbox']"));

        // Click each checkbox using a for loop
        for (int i = 0; i < checkboxes.size(); i++) {
            checkboxes.get(i).click();
        }



        System.out.println("Execution will be ended ");
    }
}
