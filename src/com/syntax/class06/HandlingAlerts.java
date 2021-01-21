package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        //simple alert
        WebElement simpleAlertButton=driver.findElement(By.id("alert"));
        simpleAlertButton.click();
        Thread.sleep(1000);
        Alert simpleAlert =driver.switchTo().alert();
        simpleAlert.accept();

        //handling confirmation alert
        WebElement confirmAlertButton=driver.findElement(By.id("confirm"));
        confirmAlertButton.click();
        Thread.sleep(1000);
        Alert confirmAlert=driver.switchTo().alert();
        String confirmAlertText=confirmAlert.getText();
        System.out.println(confirmAlertText);
        confirmAlert.dismiss();

        //prompt alert
        WebElement prompAlertButton=driver.findElement(By.id("prompt"));
        Thread.sleep(1000);
        prompAlertButton.click();
        Thread.sleep(1000);
        Alert promptAlert=driver.switchTo().alert();
        Thread.sleep(1000);
        promptAlert.sendKeys("Syntax fun");
        Thread.sleep(1000);
        promptAlert.accept();


    }
}
