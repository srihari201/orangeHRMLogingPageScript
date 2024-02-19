package com.selnium.practice;

public class HandlingCheckboxesUsingForEach extends BaseClass {


    public void url() {
        enterUrl("https://testautomationpractice.blogspot.com/");
        java.util.List<org.openqa.selenium.WebElement> checkboxes = driver.findElements(org.openqa.selenium.By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        java.lang.System.out.println("Total number of check boxes which are available " + checkboxes.size());
        for (org.openqa.selenium.WebElement chk : checkboxes) {
           // java.lang.System.out.println(chk);
            chk.click();

        }}
    public static void main (String[]args){
        HandlingCheckboxesUsingForEach ref = new HandlingCheckboxesUsingForEach();
        ref.url();


    }
}
