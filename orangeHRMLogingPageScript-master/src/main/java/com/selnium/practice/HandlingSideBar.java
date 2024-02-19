package com.selnium.practice;

public class HandlingSideBar extends LoginHRMPage {

    public void callingLogin() {
        preReq();

    }

    public void loginPage() {
        driver.findElements(org.openqa.selenium.By.xpath(XpathClass.userNameXPath)).clear();
        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.userNameXPath)).sendKeys(TestData.UserName);
        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.passwordXpath)).clear();
        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.passwordXpath)).sendKeys(TestData.password);
        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.loginButtonXpath)).click();

    }

    public void sideBar() {
        java.util.List<org.openqa.selenium.WebElement> listOfSidebars = driver.findElements(org.openqa.selenium.By.xpath(XpathClass.sideBarXpath));
        System.out.println("Total Number of Side bars which are available " + listOfSidebars.size());
        if(listOfSidebars.get(0).isDisplayed()) {
            System.out.println("First list from the sidebar is: " +listOfSidebars.get(0).getText());
            listOfSidebars.get(0).click();
        }
        else {
            java.lang.System.out.println("Second sidebar not found or not displayed.");
        }
        String AdminTopBarHeaderBreadcrumbText=driver.findElement(org.openqa.selenium.By.xpath(XpathClass.AdminTopBarHeaderBreadcrumbXpath)).getText();
        java.lang.System.out.println(AdminTopBarHeaderBreadcrumbText);
        String actual_AdminTopBarHeaderBreadcrumbText="";
        String expected_AdminTopBarHeaderBreadcrumbText="";
    }
    public void sideBarAdmin(){

        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.addBtnXpath)).click();

    }


    public static void main(String[] args) {
        HandlingSideBar hs = new HandlingSideBar();
        hs.preReq();
        hs.loginPage();
        hs.sideBar();
        hs.sideBarAdmin();
    }
}