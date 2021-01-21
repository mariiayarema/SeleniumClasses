package com.syntax.class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class RightAndDoubleClickAction {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement rightClickButton=driver.findElement(By.xpath("//span[text()='right click me']"));
        rightClickButton.click();
        Actions action=new Actions(driver);
        action.contextClick(rightClickButton).perform();
        WebElement editOption=driver.findElement(By.xpath("//span[text()='Edit']"));
        Thread.sleep(2000);
        editOption.click();
        //action.click(editOption);
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);
        WebElement dblClickButton=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        action.doubleClick(dblClickButton).perform();
        System.out.println(alert.getText());
        alert.accept();


    }
}
