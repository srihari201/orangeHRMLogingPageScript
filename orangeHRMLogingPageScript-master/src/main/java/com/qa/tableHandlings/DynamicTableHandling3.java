package com.qa.tableHandlings;


import org.openqa.selenium.By;

public class DynamicTableHandling3 {
    static org.openqa.selenium.WebDriver driver;
    static java.lang.String Catalog_xpath = "//a[contains(normalize-space(),'Catalog')]";
    static java.lang.String Catalog_Categories_xpath = "//ul[@id='collapse-1']//a[contains(text(),'Categories')]";
    static java.lang.String categoriesTable_xpath = "//table[contains(@class,'table')]//tbody//tr";


    public static void main(java.lang.String args[]) throws InterruptedException {
        java.lang.System.out.println("Execution will be started from main method");
        driver = new org.openqa.selenium.chrome.ChromeDriver();
        driver.get(DynamicTable1.AppURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(DynamicTable1.Implicitly_Wait));
        org.openqa.selenium.WebElement username_WebElement = driver.findElement(org.openqa.selenium.By.cssSelector(DynamicTable1.username_cssSelector));
        username_WebElement.clear();
        username_WebElement.click();
        username_WebElement.sendKeys(DynamicTable1.un_testData);

        org.openqa.selenium.WebElement password_WebElement = driver.findElement(org.openqa.selenium.By.cssSelector(DynamicTable1.password_cssSelector));
        password_WebElement.clear();
        password_WebElement.click();
        password_WebElement.sendKeys(DynamicTable1.pwd_testData);

        driver.findElement(org.openqa.selenium.By.cssSelector(".btn")).click();


        if (driver.findElement(org.openqa.selenium.By.xpath(DynamicTable1.popup_closebtn_xpath)).isDisplayed()) {
            driver.findElement(org.openqa.selenium.By.xpath(DynamicTable1.popup_closebtn_xpath)).click();
        }
        java.lang.Thread.sleep(1000);
        java.lang.String act_landingPageTitle = driver.getTitle();
        System.out.println("Actual landing page title is " + act_landingPageTitle);
        if (act_landingPageTitle.equals(DynamicTable1.LandingPageTitle)) {
            java.lang.System.out.println("Success: The tile of the landing page is matched ");
        } else {
            java.lang.System.out.println("Error: The title of the landing page is not matched");
        }
        driver.findElement(org.openqa.selenium.By.xpath(Catalog_xpath)).click();
        driver.findElement(org.openqa.selenium.By.xpath(Catalog_Categories_xpath)).click();
        java.lang.String total_pages_text = driver.findElement(org.openqa.selenium.By.xpath(DynamicTable1.totalPages_xpath)).getText();
        java.lang.System.out.println("Total Pages text " + total_pages_text + "\n");
        int totalNumberOfPages = java.lang.Integer.parseInt(total_pages_text.substring(total_pages_text.indexOf("(") + 1, total_pages_text.indexOf("Pages") - 1));
        java.lang.System.out.println("Total Number of Pages " + totalNumberOfPages + "\n");




        for (int i = 1; i <= totalNumberOfPages; i++) {
            int totalNumberOfRows = driver.findElements(org.openqa.selenium.By.xpath(categoriesTable_xpath)).size();
            java.lang.System.out.println("Total Number of Rows " + totalNumberOfRows + "\n");
            if (totalNumberOfPages > 1) {
                org.openqa.selenium.WebElement activePage = driver.findElement(org.openqa.selenium.By.xpath("//ul[@class='pagination']//li//*[contains(text(),'" + i + "')]"));
                java.lang.System.out.println("Active page is " + activePage.getText());
                activePage.click();
                java.lang.Thread.sleep(1000);
            }

            int sum = 0;
            for (int r = 1; r <= totalNumberOfRows; r++) {
                String SortOrder_Info = driver.findElement(org.openqa.selenium.By.xpath("//table[contains(@class,'table')]//tbody//tr["+r+"]//td[3]")).getText();
                System.out.println(SortOrder_Info);
                //  sum = sum + Integer.parseInt(SortOrder_Info);
                if (SortOrder_Info.equals("1")) {
                    String categoryName_Info = driver.findElement(org.openqa.selenium.By.xpath("//table//tbody//tr["+r+"]//td[2]")).getText();
                    java.lang.System.out.println(SortOrder_Info + " " +categoryName_Info);

                }
                System.out.println();
            }


        }

        java.lang.System.out.println("Execution will be ended");
    }
}