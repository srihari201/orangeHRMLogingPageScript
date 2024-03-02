package com.selnium.practice;

public class DatePicker2 extends BaseClass{
    public void init(){
        enterUrl(XpathClass.datePickerURL);

    }
    public void handlingDatePickerApproach2(){
        org.openqa.selenium.WebElement we=  driver.findElement(org.openqa.selenium.By.xpath(XpathClass.datePickerIframe));
        driver.switchTo().frame(we);
        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.datePickerField)).click();
        String year="2024";
        String month="September";
        String date="10";
        while(true){
            String mon=    driver.findElement(org.openqa.selenium.By.xpath(XpathClass.datePickerMonthXpath)).getText();
            String yr=   driver.findElement(org.openqa.selenium.By.xpath(XpathClass.datePickerYearXPath)).getText();
            if(mon.equals(month) && yr.equals(year)){
                break;
            }
            driver.findElement(org.openqa.selenium.By.xpath(XpathClass.datePickerNextButtonXpath)).click();

        }

        java.util.List<org.openqa.selenium.WebElement> allDates=driver.findElements(org.openqa.selenium.By.xpath(XpathClass.datePickerDateXpath));
        for(org.openqa.selenium.WebElement dt:allDates) {
            System.out.println(dt.getText());
            if (dt.getText().equals(date)) {

                dt.click();
                break;

            }
        }
    }

    public static void main(String[] args) {
        DatePicker2 ref=new DatePicker2();
        ref.init();
        ref.handlingDatePickerApproach2();
    }
}
