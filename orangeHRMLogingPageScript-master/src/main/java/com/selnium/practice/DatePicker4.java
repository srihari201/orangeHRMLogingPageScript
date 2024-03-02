package com.selnium.practice;

import org.openqa.selenium.WebElement;

import java.util.List;

public class DatePicker4 extends BaseClass{
    public void init(){
        enterUrl(XpathClass.datePickerURL);
    }
    public void datePickerPrevious(){
        driver.switchTo().frame(0);

        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.datePickerField)).click();

        String year="2022";
        String month="February";
        String date="10";

        while(true){
            String yr=driver.findElement(org.openqa.selenium.By.xpath(XpathClass.datePickerYearXPath)).getText();
            String mn=driver.findElement(org.openqa.selenium.By.xpath(XpathClass.datePickerMonthXpath)).getText();
            if(yr.equals(year) && mn.equals(month)){
                break;

            }
            driver.findElement(org.openqa.selenium.By.xpath(XpathClass.datePickerPreviousXpath)).click();
        }
        List< WebElement >allDates=driver.findElements(org.openqa.selenium.By.xpath(XpathClass.datePickerDateXpath));

        for(int i=0;i<allDates.size();i++){
            if(allDates.get(i).getText().equals(date)){
                allDates.get(i).click();
                break;

            }

        }

    }


    public static void main(String[] args){
        DatePicker4 d4=new DatePicker4();
        d4.init();
        d4.datePickerPrevious();
    }
}


