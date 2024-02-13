package com.qa.tableHandlings;

public class staticTableHandling6 {
    static org.openqa.selenium.WebDriver driver;
    static java.lang.String AppURL="https://testautomationpractice.blogspot.com/";
    public static void main(java.lang.String args[]){
        java.lang.System.out.println("Execution will be started from main method");
        driver=new org.openqa.selenium.chrome.ChromeDriver ();
        driver.get(AppURL);
        org.openqa.selenium.support.ui.WebDriverWait explicitWait=new org.openqa.selenium.support.ui.WebDriverWait(driver,java.time.Duration.ofSeconds(10));
        // driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.manage().window().maximize();
        int rows= explicitWait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElementsLocatedBy(org.openqa.selenium.By.xpath("//table[@name='BookTable']//tr"))).size();
        java.lang.System.out.println("Total number of available rows in books table:" + rows);

        //getting the
        for(int r=2;r<=rows;r++){
            java.lang.String subject_info=explicitWait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(org.openqa.selenium.By.xpath("//table[@name='BookTable']//tr["+r+"]//td[3]"))).getText();
            if(subject_info.equals("Selenium")){
                java.lang.String bookName_Info=explicitWait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(org.openqa.selenium.By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]"))).getText();
                java.lang.System.out.println( subject_info + " " + bookName_Info );
            }
        }



        java.lang.System.out.println("Execution will be ended");

    }
}
