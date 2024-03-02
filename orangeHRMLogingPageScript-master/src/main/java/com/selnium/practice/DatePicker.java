package com.selnium.practice;

import org.openqa.selenium.WebElement;

public class DatePicker extends BaseClass {
    public void init(){
        enterUrl(XpathClass.datePickerURL);



    }
    public void handleDatePicker() throws InterruptedException {
        WebElement frame0=    driver.findElement(org.openqa.selenium.By.xpath(XpathClass.datePickerIframe));
        driver.switchTo().frame(frame0);
        Thread.sleep(5000);
        WebElement datepicker= driver.findElement(org.openqa.selenium.By.xpath(XpathClass.datePickerField));
        datepicker.click();
        datepicker.sendKeys("02/24/2024");
    }


    public static void main(String[] args) throws InterruptedException {
        DatePicker dp=new DatePicker();
        dp.init();
        dp.handleDatePicker();

    }
}
