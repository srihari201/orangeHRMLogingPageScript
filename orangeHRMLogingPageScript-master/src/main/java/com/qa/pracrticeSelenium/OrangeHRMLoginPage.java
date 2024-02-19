package com.qa.pracrticeSelenium;


//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLoginPage {
    public static void main(String args[]) throws InterruptedException {
        // WebDriverManager.chromedriver().setup(); //we can use this by using webDriverManager dependency and not req set property if we use this
        //  ChromeDriver driver=new ChromeDriver();
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement UserName= driver.findElement(By.name("username"));
        UserName.clear();
        UserName.click();
        UserName.sendKeys("Admin");
        WebElement UserPwd= driver.findElement(By.name("password"));
        UserPwd.clear();
        UserPwd.click();
        UserPwd.sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        String Act_Title= driver.getTitle();
        String Exp_Title="OrangeHRM";
        if(Act_Title.equals(Exp_Title)) {

            System.out.println("The title is correct");
        }
        else{
            System.out.println("The title is incorrect");
        }
        Thread.sleep(5000);

        String ActLabel= driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
        String ExpLabel="Dashboard";
        if(ActLabel.equals(ExpLabel)){
            System.out.println("The label is correct : " + ExpLabel);
        }
        else {
            System.out.println("The label is incorrect : " +ActLabel);
        }
        driver.quit();





    }
}
