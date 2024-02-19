package com.qa.tableHandlings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StaticTable2 {
    static WebDriver driver;
    static String AppURL="https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";


    public static void main(String args[]){
        System.out.println("Execution will be started from main method \n");
        driver=new ChromeDriver();
        driver.get(AppURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        int totalRows=driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
        System.out.println("Total Number of Rows in customer table: " + totalRows);
        int totalColumns= driver.findElements(By.xpath("//table[@id='customers']//th")).size();
        System.out.println("Total Number of Columns in the customer table: " + totalColumns);
        for(int r=2;r<=totalRows;r++){
            for(int c=1;c<=totalColumns;c++){
                String rowTexts= driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]//td["+c+"]")).getText();
                System.out.print(rowTexts + "     ");

            }
            System.out.println();
        }



        System.out.println("\n Execution will be completed");

    }
}
