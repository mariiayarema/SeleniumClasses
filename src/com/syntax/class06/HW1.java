package com.syntax.class06;

import javafx.beans.property.SetProperty;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/javascript-alert-box-demo.php");
        driver.manage().window().maximize();
        //handling simple alert
        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
   Thread.sleep(2000);
        //handling confirmation alert
        driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
        alert=driver.switchTo().alert();
        alert.dismiss();


        //handling prompt alert
        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        alert=driver.switchTo().alert();
        Thread.sleep(2000);
        String textToSend="Mariia Yarema";
        alert.sendKeys(textToSend);
        alert.accept();
        String passedText=driver.findElement(By.id("prompt-demo")).getText();
        System.out.println(passedText);
if(textToSend.equals(passedText)){
    System.out.println("Test passed.Expected text match actual text");
}else{
    System.out.println("Test fail.Expected text not matching actual text");
}

    driver.close();

    }
}
