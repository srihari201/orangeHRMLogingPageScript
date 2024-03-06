package com.selnium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MouseActions3 extends BaseClass{
    //PreRequesties of the application
    public void init(){

        enterUrl(XpathClass.demoWebShopURL);
    }

    //Login to the system
    public void loginToSystem() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.DemoWebShopLoginBtn)).click();
        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.DemoWebShopEmailXpath)).sendKeys(TestData.EMAIL_ID);

        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.DemoWebShopPasswordXpath)).sendKeys(TestData.PASSWORD);
        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.DemoWebShopLogin)).click();

    }
    //handling  mouse actions

    public void handlingMouseEvents() throws InterruptedException {
        org.openqa.selenium.WebElement electronicsElement = driver.findElement(org.openqa.selenium.By.xpath(XpathClass.electronicsTopElementXpath));
        org.openqa.selenium.WebElement cellPhones = driver.findElement(org.openqa.selenium.By.xpath(XpathClass.cameraXpath));
        org.openqa.selenium.interactions.Actions ae = new org.openqa.selenium.interactions.Actions(driver);
        ae.moveToElement(electronicsElement).moveToElement(cellPhones).click().perform();

        String cellPhoneActualText = driver.findElement(org.openqa.selenium.By.xpath("//h1[normalize-space()='Cell phones']")).getText();
        if (cellPhoneActualText.equals("Cell phones")) {
            System.out.println("The cell phone page text is matched");
        } else {
            System.out.println("The cell phone page text is not matched");
        }

        //Handling sortBy Dropdown
        org.openqa.selenium.WebElement we = driver.findElement(org.openqa.selenium.By.xpath("//select[@id='products-orderby']"));
        org.openqa.selenium.support.ui.Select se = new org.openqa.selenium.support.ui.Select(we);
        se.selectByVisibleText("Name: A to Z");
        Thread.sleep(5000);
    }

    public void handlingViewModeDropdown() {
        // Handling ViewMode dropdown
        WebElement viewModeDropdown = driver.findElement(By.xpath("//select[@id='products-viewmode']"));
        Select select = new Select(viewModeDropdown);

        if (viewModeDropdown.isDisplayed()) {
            String selectedOption = select.getFirstSelectedOption().getText();
            System.out.println("Selected dropdown option: " + selectedOption);

            if (selectedOption.equals("Grid")) {
                System.out.println("The selected ViewMode is Grid, so changing to List");
                select.selectByVisibleText("List");
                System.out.println("The selected ViewMode changed to List");
            } else {
                System.out.println("The ViewMode dropdown is not set to Grid");
            }
        } else {
            System.out.println("The ViewMode dropdown is not enabled");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MouseActions3 m3=new MouseActions3();
        m3.init();
        m3.loginToSystem();
        m3.handlingMouseEvents();
        m3.handlingViewModeDropdown();


    }


}
