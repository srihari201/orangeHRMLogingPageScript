package com.selnium.practice;



public class SelectDeselectCheckboxes extends BaseClass {
    public void preRequisites() throws InterruptedException {
        enterUrl(XpathClass.techlisticCheckboxUrl);
        java.util.List<org.openqa.selenium.WebElement> automationCheckboxes=  driver.findElements(org.openqa.selenium.By.xpath(XpathClass.automationToolXpath));
        java.lang.System.out.println("Total Number of available checkboxes in automation tool " +automationCheckboxes.size() );
        for(int i=0;i<3;i++){
            automationCheckboxes.get(i).click();
        }
        java.lang.Thread.sleep(5000);
        for(int i=0;i<automationCheckboxes.size();i++ ){
            if(automationCheckboxes.get(i).isSelected()){
                automationCheckboxes.get(i).click();
            }

        }

    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Execution will be started from main method by JVM");
        SelectDeselectCheckboxes ref=new SelectDeselectCheckboxes();
        ref.preRequisites();
        System.out.println("Execution will be ended");

    }
}
