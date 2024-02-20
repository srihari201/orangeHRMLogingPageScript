package com.selnium.practice;

public class HandlingWindowsApproach2 extends BaseClass{
    public void initialization() throws InterruptedException {
        enterUrl(XpathClass.orangeHRM_URL);
        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.link1Xpath)).click();


    }
    public void windowHandling(){
        java.util.Set<String> windowIDs= driver.getWindowHandles();
        for( String winid:windowIDs){
            String title=  driver.switchTo().window(winid).getTitle();
            System.out.println(title);
            if(title.equals("OrangeHRM HR Software | OrangeHRM")){
                driver.findElement(org.openqa.selenium.By.xpath(XpathClass.contactSaleXpath)).click();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        java.lang.System.out.println("...Execution starts from main method by JVM...");
        HandlingWindowsApproach2 hwa2=new HandlingWindowsApproach2();
        hwa2.initialization();
        hwa2.windowHandling();
        java.lang.System.out.println("...Execution will be ended...");
    }

}
