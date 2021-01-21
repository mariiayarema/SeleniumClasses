package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework3 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.navigate().to("http://18.232.148.34/humanresources/symfony/web/index.php/auth/login");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@name='Submit']")).click();
        WebElement errorMessage=driver.findElement(By.cssSelector("span[id='spanMessage']"));
        boolean isErrorMessageDisplayed=errorMessage.isDisplayed();
        if(isErrorMessageDisplayed){
            System.out.println("Error message is displayed");
        }else {
            System.out.println("Error message is missing");
        }
        driver.quit();



    }
}
