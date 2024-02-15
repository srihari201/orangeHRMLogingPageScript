package com.selnium.practice;

import org.openqa.selenium.WebElement;

public class HandlingCheckBoxesTwo extends BaseClass {
    public void preRequisites() throws InterruptedException {
        enterUrl("https://www.techlistic.com/p/selenium-practice-form.html");
        java.util.List<org.openqa.selenium.WebElement> automationToolCheckboxes= driver.findElements(org.openqa.selenium.By.xpath(XpathClass.automationToolXpath));
        java.lang.System.out.println("Total Number of checkboxes which are available in automationToolCheckboxes  " + automationToolCheckboxes.size());
        for(int i=0;i<automationToolCheckboxes.size();i++){
            if(i<2){
                automationToolCheckboxes.get(i).click();
            }

        }
        java.lang.Thread.sleep(5000);
        System.out.println();
        java.util.List<WebElement> professionCheckboxCheckboxes=driver.findElements(org.openqa.selenium.By.xpath(XpathClass.professionCheckboxXpath));
        java.lang.System.out.println("Total Number of checkboxes which are available in professionCheckboxCheckboxes  " + professionCheckboxCheckboxes.size() );
        for(int i=0;i<professionCheckboxCheckboxes.size();i++){

            professionCheckboxCheckboxes.get(i).click();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        HandlingCheckBoxesTwo hct=new HandlingCheckBoxesTwo();
        hct.preRequisites();

    }

}
