package com.selnium.practice;

public class SelectLastTwoCheckBoxes extends BaseClass{
    public void handlingLastTwoCheckboxes() throws InterruptedException {
        enterUrl("https://testautomationpractice.blogspot.com/");
        Thread.sleep(5000);
        java.util.List<org.openqa.selenium.WebElement> checkboxes= driver.findElements(org.openqa.selenium.By.xpath("//input[@class='form-check-input'][@type='checkbox']"));
        java.lang.System.out.println(checkboxes.size());
        Thread.sleep(5000);
        for(int i=5;i<checkboxes.size();i++){

            org.openqa.selenium.WebElement labelElement = driver.findElement(org.openqa.selenium.By.xpath("(//input[@class='form-check-input'][@type='checkbox'])[" + (i + 1) + "]/following-sibling::label"));
            String labelText = labelElement.getText();
            // Print the label text
            System.out.println("Label for checkbox " + (i + 1) + ": " + labelText);
            checkboxes.get(i).click();

        }
        // closeBrowser();



    }
    public static void main(String args[]) throws InterruptedException {
        System.out.println("Execution will be started from main method by JVM");
        SelectLastTwoCheckBoxes checkBoxSelector = new SelectLastTwoCheckBoxes();
        checkBoxSelector.handlingLastTwoCheckboxes();

        System.out.println("Execution will be ended");
    }
}
