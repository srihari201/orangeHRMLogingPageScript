package com.selnium.practice;

public class XpathClass {
    static String orangeHRM_URL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    static  String frames_URL="https://demoqa.com/frames";
    static String innerFrame_URL="https://ui.vision/demo/webtest/frames/";
    static String userNameXPath="//input[@name='username']";
    static String passwordXpath="//input[@name='password']";

    static String loginButtonXpath="//button[normalize-space()='Login']";

    static String dashBoardLabelXpath="//h6[normalize-space()='Dashboard']";

    static String sideBarXpath="//ul[@class='oxd-main-menu']/li";
    static String AdminTopBarHeaderBreadcrumbXpath="//div[@class='oxd-topbar-header-title']";
    static String addBtnXpath="//div/button[@class='oxd-button oxd-button--medium oxd-button--secondary']";

    static String techlisticCheckboxUrl="https://www.techlistic.com/p/selenium-practice-form.html";

    static String professionCheckboxXpath="//input[@name='profession'][@type='checkbox']";
    static String automationToolXpath="//input[@name='tool'][@type='checkbox']";
    static String frame1="//frame[@src='frame_1.html']";
    static String myTextField1="//input[@name='mytext1']";

    static String frame3="//frame[@src='frame_3.html']";
    static String myTextField3="//input[@name='mytext3']";
    static String radioBtnCss=".AB7Lab";

    static String link1Xpath="//a[contains(normalize-space(),'OrangeHRM, Inc')]";
    static String contactSaleXpath="//div[@class='d-flex web-menu-btn']//li[1]//a[1]";
}
