package com.selnium.practice;

public class HandlingFirstTwoCheckBoxes extends  BaseClass{
    public void preRequisites() throws InterruptedException {
        enterUrl("https://testautomationpractice.blogspot.com/");
        java.util.List<org.openqa.selenium.WebElement> dayCheckBoxElements=driver.findElements(org.openqa.selenium.By.xpath("//input[@class='form-check-input'][@type='checkbox']"));
        java.lang.System.out.println("Total Number of checkboxes which are available " + dayCheckBoxElements.size());
        System.out.println();
        Thread.sleep(5000);
        for(int i=0;i<2;i++){
            dayCheckBoxElements.get(i).click();

        }


    }
    public static void main(String args[]) throws InterruptedException {
        HandlingFirstTwoCheckBoxes ref=new HandlingFirstTwoCheckBoxes();
        ref.preRequisites();

    }

}
