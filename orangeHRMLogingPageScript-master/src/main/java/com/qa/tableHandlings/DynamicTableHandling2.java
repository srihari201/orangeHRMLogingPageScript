package com.qa.tableHandlings;

public class DynamicTableHandling2 {
    static org.openqa.selenium.WebDriver driver;
    static java.lang.String sales_xpath = "//a[contains(normalize-space(),'Sales')]";
    static java.lang.String sales_Orders_xpath = "//ul[@id='collapse-4']//li//a[contains(text(),'Orders')]";
    //static java.lang.String


    public static void main(java.lang.String args[]) {

        java.lang.System.out.println("Execution will be started from main method");
        driver=new org.openqa.selenium.chrome.ChromeDriver();
        driver.get(DynamicTable1.AppURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        org.openqa.selenium.WebElement username_webElement= driver.findElement(org.openqa.selenium.By.cssSelector(DynamicTable1.username_cssSelector));
        username_webElement.clear();
        username_webElement.clear();
        username_webElement.sendKeys(DynamicTable1.un_testData);
        org.openqa.selenium.WebElement password_webElement= driver.findElement(org.openqa.selenium.By.cssSelector(DynamicTable1.password_cssSelector));
        password_webElement.clear();
        password_webElement.clear();
        password_webElement.sendKeys(DynamicTable1.pwd_testData);
        driver.findElement(org.openqa.selenium.By.cssSelector(".btn")).click();
        if(driver.findElement(org.openqa.selenium.By.xpath(DynamicTable1.popup_closebtn_xpath)).isDisplayed()){
            driver.findElement(org.openqa.selenium.By.xpath(DynamicTable1.popup_closebtn_xpath)).click();


        }
        driver.findElement(org.openqa.selenium.By.xpath(sales_xpath)).click();
        driver.findElement(org.openqa.selenium.By.xpath(sales_Orders_xpath)).click();



        java.lang.System.out.println("Execution will be completed");
    }
}
