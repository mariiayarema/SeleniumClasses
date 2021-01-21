package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    //https://the-internet.herokuapp.com/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("JavaScript Alerts")).click();
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        String expectedText="I am a JS Alert";
        Alert alert=driver.switchTo().alert();

        String alertTextFromApp=alert.getText();

        if(expectedText.equalsIgnoreCase(alertTextFromApp)){
            System.out.println("Alert is present.Test pass.");
        }else {
            System.out.println("Not valid text on the alert.TestFail");
        }
        alert.accept();

        //handling second confirm alert
        driver.findElement(By.cssSelector("button[onclick = 'jsConfirm()']")).click();
        alert=driver.switchTo().alert();
        Thread.sleep(2000);
        alert.dismiss();

        //handling prompt alert


        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        alert=driver.switchTo().alert();
        String textToSend="Hello From Batch8";
        alert.sendKeys(textToSend);

        alert.accept();
        String enteredText=driver.findElement(By.id("result")).getText();
       String[]textArray= enteredText.split(":");
       String textTrim=textArray[1].trim();

        if(textTrim.equals(textToSend)){
            System.out.println("Text is matching.Test Pass");
        }else{
            System.out.println("Text isn't matching.Test Fail");
        }
        driver.quit();


    }
}
