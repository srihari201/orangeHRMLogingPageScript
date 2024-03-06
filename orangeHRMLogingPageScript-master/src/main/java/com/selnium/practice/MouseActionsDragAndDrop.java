package com.selnium.practice;

public class MouseActionsDragAndDrop extends BaseClass{
    @Override
    public void enterUrl(String url){
        super.enterUrl(url);
    }
    public void dragAndDrop(){
        org.openqa.selenium.WebElement box3= driver.findElement(org.openqa.selenium.By.xpath("//div[@id='box3']"));
        org.openqa.selenium.WebElement box105=driver.findElement(org.openqa.selenium.By.xpath("//div[@id='box105']"));
        org.openqa.selenium.WebElement box6=  driver.findElement(org.openqa.selenium.By.xpath("//div[@id='box6']"));
        org.openqa.selenium.WebElement box103=driver.findElement(org.openqa.selenium.By.xpath("//div[@id='box103']"));

        org.openqa.selenium.interactions.Actions ref=new org.openqa.selenium.interactions.Actions(driver);
        ref.dragAndDrop(box3,box105).perform();
        ref.dragAndDrop(box6,box103).build().perform();

    }

    public static void main(String[] args) {
        MouseActionsDragAndDrop ref1=new MouseActionsDragAndDrop();
        ref1.enterUrl("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        ref1.dragAndDrop();
    }

}
