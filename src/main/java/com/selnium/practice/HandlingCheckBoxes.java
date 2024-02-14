package com.selnium.practice;

public class HandlingCheckBoxes {
    public static void main(String args[]){
        System.out.println("Execution will be started from main method by JVM");
        org.openqa.selenium.WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.get(TestData.checkBoxURL);
        System.out.println(".......URL validation after user logged into the system...........");
        String actual_url=driver.getCurrentUrl();
        java.lang.System.out.println("the Current url is " + actual_url);
        String expected_url=TestData.checkBoxURL;
        if (actual_url.equals(expected_url)){
            java.lang.System.out.println("The url is matched");
        }
        else{
            java.lang.System.out.println("The url is not matched");
        }

        System.out.println("\n....... Counting the number of checkboxes and selecting all......" );
        java.util.List<org.openqa.selenium.WebElement>  checkboxes=driver.findElements(org.openqa.selenium.By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        java.lang.System.out.println("Total No of checkboxes " + checkboxes.size());
        for(int i=0;i< checkboxes.size();i++){
            checkboxes.get(i).click();
        }





        System.out.println("Execution will be ended");


    }
}
