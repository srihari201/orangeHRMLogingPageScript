package com.selnium.practice;

public class MouseActionsRightClick extends BaseClass{
    public void init(){
        enterUrl("http://swisnl.github.io/jQuery-contextMenu/demo.html");
    }
    public void performRightClick() throws InterruptedException {
        org.openqa.selenium.WebElement e1=  driver.findElement(org.openqa.selenium.By.xpath("//span[normalize-space()='right click me']"));
        org.openqa.selenium.interactions.Actions as=new org.openqa.selenium.interactions.Actions(driver);
        as.contextClick(e1).perform();
        java.lang.Thread.sleep(5000);
        driver.findElement(org.openqa.selenium.By.xpath("//span[normalize-space()='Copy']")).click();
        java.lang.Thread.sleep(5000);
        driver.switchTo().alert().accept();

    }


    public static void main(String[] args) throws InterruptedException {
        MouseActionsRightClick msrc=new MouseActionsRightClick();
        msrc.init();
        msrc.performRightClick();

    }

}
