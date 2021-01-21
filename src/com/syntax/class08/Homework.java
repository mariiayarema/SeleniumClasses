package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Homework {
    public static String url = "https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);

        WebDriverWait wait=new WebDriverWait(driver,10);

        WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        WebElement remove=driver.findElement(By.xpath("//button[text()='Remove']"));
        remove.click();

        WebElement afterRemovalElement=driver.findElement(By.id("message"));
        wait.until(ExpectedConditions.visibilityOf(afterRemovalElement));
        String textAfterRemove=afterRemovalElement.getText();
        System.out.println(textAfterRemove);


        WebDriverWait wait1=new WebDriverWait(driver,10);
        WebElement enableButton=driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        Thread.sleep(2000);
        enableButton.click();
        WebElement afterEnable=driver.findElement(By.xpath("//p[@id='message']"));
        wait1.until(ExpectedConditions.visibilityOf(afterEnable));
        WebElement enterTextElement=driver.findElement(By.xpath("//input[@type='text']"));
        enterTextElement.isEnabled();
        enterTextElement.sendKeys("Syntax Technologies");
        WebElement disableButton=driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        disableButton.click();
        enterTextElement.isEnabled();
    }
}
