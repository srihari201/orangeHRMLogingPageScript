package com.qa.tableHandlings;

import org.openqa.selenium.WebElement;

public class DynamicTable1 {
    static org.openqa.selenium.WebDriver driver;
    static java.lang.String AppURL = "https://demo.opencart.com/admin/";
    static long Implicitly_Wait=10;
    static java.lang.String un_testData = "demo";
    static java.lang.String pwd_testData = "demo";
    static java.lang.String LandingPageTitle="Dashboard";
    static java.lang.String username_cssSelector="input#input-username";
    static java.lang.String password_cssSelector="input#input-password";
    static java.lang.String popup_closebtn_xpath="//div[@class='modal-header']//button";
    static java.lang.String totalPages_xpath="//div[@class='col-sm-6 text-end']";


    public static void main(java.lang.String args[]) throws InterruptedException {
        java.lang.System.out.println("Execution will be started from main method ");
        driver = new org.openqa.selenium.chrome.ChromeDriver();
        driver.get(AppURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        org.openqa.selenium.WebElement username = driver.findElement(org.openqa.selenium.By.cssSelector(username_cssSelector));
        username.clear();
        username.click();
        username.sendKeys(un_testData);
        org.openqa.selenium.WebElement password = driver.findElement(org.openqa.selenium.By.cssSelector(password_cssSelector));
        password.clear();
        password.click();
        password.sendKeys(pwd_testData);
        driver.findElement(org.openqa.selenium.By.cssSelector(".btn")).click();

        if (driver.findElement(org.openqa.selenium.By.xpath(popup_closebtn_xpath)).isDisplayed()) {
            driver.findElement(org.openqa.selenium.By.xpath(popup_closebtn_xpath)).click();

        }
        driver.findElement(org.openqa.selenium.By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
        driver.findElement(org.openqa.selenium.By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
        java.lang.String text = driver.findElement(org.openqa.selenium.By.xpath("//div[@class='col-sm-6 text-end']")).getText();
        java.lang.System.out.println(text);
        int total_pages = Integer.parseInt(text.substring(text.indexOf("(") + 1, text.indexOf("Pages") - 1));
        System.out.println("Total number of pages:" + total_pages);
        int totalNumberOfRows = driver.findElements(org.openqa.selenium.By.xpath("//table//tbody//tr")).size();
        java.lang.System.out.println("Total Number of Row in customer table is " + totalNumberOfRows);

        // int total_pages= java.lang.Integer.parseInt ( text.substring(text.indexOf("(")+1,text.indexOf("Page")-1));
        //  java.lang.System.out.println("Total Number of page " + total_pages);
        for (int i = 1; i <= 10; i++) {
            if (total_pages > 1) {
                org.openqa.selenium.WebElement active_page = driver.findElement(org.openqa.selenium.By.xpath("//ul[@class='pagination']//li//*[contains(text()," + i + ")]"));
                System.out.println(" Active Page:" +active_page.getText());
                active_page.click();
                java.lang.Thread.sleep(1000);


            }
            for (int r = 1; r <= totalNumberOfRows; r++) {
                java.lang.String customer_Name = driver.findElement(org.openqa.selenium.By.xpath("//table//tbody//tr[" + r + "]//td[2]")).getText();

                java.lang.String email = driver.findElement(org.openqa.selenium.By.xpath("//table//tbody//tr[" + r + "]//td[3]")).getText();
                java.lang.String status = driver.findElement(org.openqa.selenium.By.xpath("//table//tbody//tr[" + r + "]//td[5]")).getText();


                java.lang.System.out.println(customer_Name + "    " + email + " " + status);
            }
            System.out.println();


        }
        java.lang.System.out.println("Execution will be ended");
    }

}





