package com.selnium.practice;




public class BookingFlights extends BaseClass{
    public void init(){
        enterUrl(XpathClass.blazeDemoURL);

    }
    public void bookFlightTickets() throws InterruptedException {

        org.openqa.selenium.WebElement departureField=driver.findElement(org.openqa.selenium.By.xpath(XpathClass.blazeDemoDepartureCityXpath));
        org.openqa.selenium.WebElement destinationField=driver.findElement(org.openqa.selenium.By.xpath(XpathClass.blazeDemoDestinationXpath));
        org.openqa.selenium.support.ui.Select sel1=new org.openqa.selenium.support.ui.Select(departureField);
        sel1.selectByVisibleText("Boston");
        org.openqa.selenium.support.ui.Select sel2=new org.openqa.selenium.support.ui.Select(destinationField);
        sel2.selectByVisibleText("London");
        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.blazeDemoFindFlightsButton)).click();

        java.lang.Thread.sleep(5000);
        String actual_title=driver.getTitle();
        if(TestData.expected_BlazeDemoTitle.equals(actual_title)){
            java.lang.System.out.println("The title is matched");
        }
        else {
            java.lang.System.out.println("The title is not matched");
        }

        java.util.List<org.openqa.selenium.WebElement> allRows=     driver.findElements(org.openqa.selenium.By.xpath(XpathClass.blazeDemoTableXpath));
        System.out.println("Total number of rows is " + allRows.size());

/*
        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.))
*/


    }


    public static void main(String[] args) throws InterruptedException {
        BookingFlights bf=new BookingFlights();
        bf.init();
        bf.bookFlightTickets();
    }
}
