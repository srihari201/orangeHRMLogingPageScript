package com.qa.tableHandlings;

public class StaticTableHandling5 {
    static org.openqa.selenium.WebDriver driver;
    static   java.lang.String AppURL="https://testautomationpractice.blogspot.com/";

    public static void main(String args[]){
        java.lang.System.out.println("Execution will be started from main method");
        driver=new org.openqa.selenium.chrome.ChromeDriver();
        driver.get(AppURL);
        org.openqa.selenium.support.ui.WebDriverWait explcitWait=new org.openqa.selenium.support.ui.WebDriverWait(driver,java.time.Duration.ofSeconds(10));
        driver.manage().window().maximize();


        int totalNumberOfRows=  explcitWait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElementsLocatedBy(org.openqa.selenium.By.xpath("//table[@name='BookTable']//tr"))).size();
        java.lang.System.out.println("Total Number of row in Books table: " + totalNumberOfRows);

        int sum=0;

        for(int i=2;i<totalNumberOfRows;i++){
            java.lang.String elements=explcitWait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(org.openqa.selenium.By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]"))).getText();
            sum=sum+java.lang.Integer.parseInt("Total amount in price column " + elements);

        }
        System.out.println(sum);


        java.lang.System.out.println("Execution will be ended ");

    }
}
