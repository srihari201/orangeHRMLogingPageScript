package com.selnium.practice;

public class MouseActionsDoubleClick extends BaseClass {
    @Override
    public void enterUrl(String url) {
        super.enterUrl(url);
    }
    public void performDoubleClick() throws InterruptedException {
        /*java.lang.Thread.sleep(5000);*/
        System.out.println("..............ffffffffffff...............");
        driver.switchTo().frame("iframeResult");
        System.out.println(".............................");
        org.openqa.selenium.WebElement field1Element= driver.findElement(org.openqa.selenium.By.xpath("//input[@id='field1']"));
        field1Element.clear();
        field1Element.sendKeys("1234");

        java.lang.Thread.sleep(5000);
        org.openqa.selenium.WebElement copyTextField=driver.findElement(org.openqa.selenium.By.xpath("//button[contains(normalize-space(),'Copy Text')]"));
        org.openqa.selenium.interactions.Actions ref=new org.openqa.selenium.interactions.Actions(driver);
        ref.doubleClick(copyTextField).perform();

        org.openqa.selenium.WebElement field2Element=driver.findElement(org.openqa.selenium.By.xpath("//input[@id='field2']"));
        String copiedText= field2Element.getAttribute("value");
        java.lang.System.out.println("The copied text is " +copiedText);

        if(copiedText.equals("1234")){
            System.out.println("The test is passed");
        }
        else{
            System.out.println("The test is failed");
        }

        driver.switchTo().defaultContent();

    }


    public static void main(String[] args) throws InterruptedException {
        MouseActionsDoubleClick mrc=new MouseActionsDoubleClick();
        mrc.enterUrl("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        mrc.performDoubleClick();
    }
}

