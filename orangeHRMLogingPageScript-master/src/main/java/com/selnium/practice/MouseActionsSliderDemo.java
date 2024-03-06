package com.selnium.practice;

public class MouseActionsSliderDemo extends BaseClass{
    @Override
    public void enterUrl(String url){
        super.enterUrl(url);
    }

    public void handlingSideBar(){
        //Handling left slide slider
        org.openqa.selenium.WebElement slider1=  driver.findElement(org.openqa.selenium.By.xpath("//span[1]"));
        System.out.println("Slider one location is " + slider1.getLocation());
        org.openqa.selenium.interactions.Actions ref=new org.openqa.selenium.interactions.Actions(driver);
        ref.dragAndDropBy(slider1,100,249).build().perform();


        //Handling right side slider
        org.openqa.selenium.WebElement slider2=driver.findElement(org.openqa.selenium.By.xpath("//span[2]"));
        System.out.println("Slider two location is " +slider2.getLocation());
        ref.dragAndDropBy(slider2,-150,249).build().perform();


    }

    public static void main(String[] args) {
        System.out.println("Execution will be started from main method by JVM");
        MouseActionsSliderDemo ref1=new MouseActionsSliderDemo();
        ref1.enterUrl("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        ref1.handlingSideBar();
        System.out.println("Execution will be ended");
    }

}
