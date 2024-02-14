package com.selnium.practice;

public class HandlingLastThreeCheckboxes extends BaseClass{
    public void preRequisites(){
        enterUrl("https://testautomationpractice.blogspot.com/");
        java.util.List <org.openqa.selenium.WebElement> DaysCheckboxElements =driver.findElements(org.openqa.selenium.By.xpath("//input[@class='form-check-input'][@type='checkbox']"));
        java.lang.System.out.println("Total number of check boxes which are available  " + DaysCheckboxElements.size());

        for(int i=4;i<DaysCheckboxElements.size();i++){
            DaysCheckboxElements.get(i).click();
        }

    }

    public static void main(String[] args) {
        HandlingLastThreeCheckboxes lastThreeCheckboxHandler=new HandlingLastThreeCheckboxes();
        lastThreeCheckboxHandler.preRequisites();
    }

}
