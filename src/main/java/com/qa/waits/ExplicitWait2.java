package com.qa.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait2 {
    public static void main(String[] args) {
        System.out.println("Execution will start from main method");
        WebDriver driver=new ChromeDriver();
        WebDriverWait myWait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        WebElement registerLink=  myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Register')]")));
        registerLink.click();
        WebElement chooseGender=  myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='gender-male' and @name='Gender']")));
        chooseGender.click();
        WebElement firstName= myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='FirstName']")));
        firstName.click();
        firstName.sendKeys("srihari");
        WebElement lastName=  myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='LastName']")));
        lastName.click();
        lastName.sendKeys("adada");
        WebElement DateOfBirthDayDropdown= myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='DateOfBirthDay']")));
        Select DateOfBirthDay=new Select(DateOfBirthDayDropdown);
        DateOfBirthDay.selectByIndex(10);
        WebElement DateOfBirthMonthDropdown=  myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='DateOfBirthMonth']")));
        Select DateOfBirthMonth=new Select(DateOfBirthMonthDropdown);
        DateOfBirthMonth.selectByIndex(6);
        WebElement DateOFBirthYearDropdown=  myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='DateOfBirthYear']")));
        Select DateOfBirthYear=new Select(DateOFBirthYearDropdown);
        DateOfBirthYear.selectByVisibleText("1997");
        WebElement emailField= driver.findElement(By.xpath("//input[@id='Email']"));
        emailField.click();
        emailField.sendKeys("srihariadada19978@gmail.com");
        WebElement password=myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Password']")));
        password.sendKeys("Srihari@123");
        WebElement confirmPassword=myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ConfirmPassword']")));
        confirmPassword.sendKeys("Srihari@123");
        myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Register')]"))).click();


        System.out.println("Execution is completed");

    }
}
