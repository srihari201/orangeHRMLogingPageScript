package com.qa.tableHandlings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class StaticTable {
    static WebDriver driver;
    static String AppUrl="https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
    static String LandingPageExp_Title="";
    public static void main(String args[]){
        driver=new ChromeDriver();
        driver.get(AppUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //Finding total number of rows
        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']//tr"));
        System.out.println("Total Number of available rows in customer table: " + rows.size());

        //Finding total number of columns
        int col=driver.findElements(By.xpath("//table[@id='customers']//th")).size();
        System.out.println("Total Number of available column in the customer table: " + col +"\n");

        //Read Specific Row and Column data (First Row First Column data)
        String headerText_11=  driver.findElement(By.xpath("//table[@id='customers']//tr[1]//th[1]")).getText();
        System.out.println("Retrieving the First Row Fist column data from customer table: " + headerText_11);

        //Read Specific Row and Column data (First Row Second column Data)
        String headerText_12=   driver.findElement(By.xpath("//table[@id='customers']//tr[1]//th[2]")).getText();
        System.out.println("Retrieving the First Row Second Column data from the Customer Table: " + headerText_12);

        //Read Specific Row and Column data (First Row Third Column Data)
        String headerText_13= driver.findElement(By.xpath("//table[@id='customers']//tr[1]//th[3]")).getText();
        System.out.println("Retrieving the First Row Second Column data from the Customer Table: " + headerText_13 +"\n");

        //Read Specific Row and Column data (Second Row First Column Data)
        String rowText_21=driver.findElement(By.xpath("//table[@id='customers']//tr[2]//td[1]")).getText();
        System.out.println("Retrieving the Second Row First Column data from the Customer Table: " + rowText_21);

        //Read Specific Row and Column Data (Second Row Second Column Data)
        String  rowText_22=driver.findElement(By.xpath("//table[@id='customers']//tr[2]//td[2]")).getText();
        System.out.println("Retrieving the Second Row Second Column data from the Customer Table: " + rowText_22);

        //Read Specific Row and Column Data (Second Row Third Column Data)
        String rowText_23= driver.findElement(By.xpath("//table[@id='customers']//tr[2]//td[3]")).getText();
        System.out.println("Retrieving the Second Row Third Column data from the Customer Table: " + rowText_23 + "\n");

        //Read Specific Row and Column Data (Third Row First Column )
        String rowText_31= driver.findElement(By.xpath("//table[@id='customers']//tr[3]//td[1]")).getText();
        System.out.println("Retrieving the Third Row First Column data from the Customer Table: " + rowText_31);

        //Read the Specific Row and Column Data(Third Row Second Column)
        String rowText_32= driver.findElement(By.xpath("//table[@id='customers']//tr[3]//td[2]")).getText();
        System.out.println("Retrieving the Third Row Second Column data from the Customer Table: " + rowText_32);

        //Read the Specific Row and Column Data(Third Row Third Column)
        String rowText_33= driver.findElement(By.xpath("//table[@id='customers']//tr[3]//td[3]")).getText();
        System.out.println("Retrieving the Third Row Third Column data from the Customer Table: " + rowText_33 + "\n");









    }
}
