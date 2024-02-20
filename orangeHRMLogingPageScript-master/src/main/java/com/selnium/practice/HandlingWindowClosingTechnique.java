package com.selnium.practice;

public class HandlingWindowClosingTechnique extends BaseClass{
    public void initialization() throws InterruptedException {
        enterUrl(XpathClass.orangeHRM_URL);
        Thread.sleep(5000);
        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.link1Xpath)).click();
    }
    public void closingWindows(){
        java.util. Set<String>  windowIDs=driver.getWindowHandles();
        for(String winID:windowIDs)
        {
            String title = driver.switchTo().window(winID).getTitle();
            System.out.println(title);
            if(title.equals("OrangeHRM HR Software | OrangeHRM")){
                driver.close();
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        HandlingWindowClosingTechnique hwct=new HandlingWindowClosingTechnique();
        hwct.initialization();
        hwct.closingWindows();

    }
}
