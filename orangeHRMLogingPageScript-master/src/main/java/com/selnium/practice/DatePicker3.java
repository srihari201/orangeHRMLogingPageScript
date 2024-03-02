package com.selnium.practice;

public class DatePicker3 extends  BaseClass{
    public void init(){
        enterUrl(XpathClass.datePickerURL);

    }
    public void handlingDatePicker(){
        driver.switchTo().frame(0);
        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.datePickerField)).click();

        String year="2025";
        String month="April";
        String date="";

        while(true){
            String yr= driver.findElement(org.openqa.selenium.By.xpath(XpathClass.datePickerYearXPath)).getText();
            String mon=driver.findElement(org.openqa.selenium.By.xpath(XpathClass.datePickerMonthXpath)).getText();

            System.out.println("---------------------------------");
            System.out.println(yr);
            System.out.println(mon);
            System.out.println(year);
            System.out.println(month);
            /*System.out.println("...........................");*/
            if(mon.equals(month) && yr.equals(year)){
                break;
            }
            driver.findElement(org.openqa.selenium.By.xpath(XpathClass.datePickerNextButtonXpath)).click();

        }




    }

    public static void main(String[] args) {
        DatePicker3 dp3=new DatePicker3();
        dp3.init();
        dp3.handlingDatePicker();
    }
}
