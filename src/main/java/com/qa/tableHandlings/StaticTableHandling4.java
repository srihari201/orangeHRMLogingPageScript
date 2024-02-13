package com.qa.tableHandlings;




public class StaticTableHandling4 {
    static org.openqa.selenium.WebDriver driver;
    static java.lang.String AppURL="https://testautomationpractice.blogspot.com/";



    public static void main(String args[]){
        System.out.println("Execution will be started main method");
        driver=new org.openqa.selenium.chrome.ChromeDriver();
        driver.get(AppURL);
        driver.manage().window().maximize();
        org.openqa.selenium.support.ui.WebDriverWait explictWait=new org.openqa.selenium.support.ui.WebDriverWait(driver,java.time.Duration.ofSeconds(10));


        int totalNumberOfRows=explictWait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElementsLocatedBy(org.openqa.selenium.By.xpath("//table[@name='BookTable']//tr"))).size();
        System.out.println("Total Number of Rows in table is " +totalNumberOfRows);

        for(int i=2;i<=totalNumberOfRows;i++) {
            java.lang.String author_info= explictWait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(org.openqa.selenium.By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]"))).getText();
            //System.out.println(author_info);
            if(author_info.equals("Amit")){
                java.lang.String bookname_info=explictWait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(org.openqa.selenium.By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]"))).getText();
                System.out.println(author_info + "    " + bookname_info);
            }


        }

        System.out.println("Execution will be ended");
    }
}
