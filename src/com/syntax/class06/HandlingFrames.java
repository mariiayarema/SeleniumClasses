package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
    public static String url="http://www.uitestpractice.com/Students/Switchto";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        //switch by index
        driver.switchTo().frame(0);

        WebElement textBox=driver.findElement(By.id("name"));
        Thread.sleep(1000);
        textBox.sendKeys("Bla bla bla");


        //coming out of frame to main page
        driver.switchTo().defaultContent();

       //switching back to frame
        // frame by name
        driver.switchTo().frame("iframe_a");
        Thread.sleep(1000);
        textBox.clear();
        Thread.sleep(1000);
        textBox.sendKeys(" any text ;D");
        driver.switchTo().defaultContent();


        //switch to frame by webElement
        WebElement frameElement=driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
        driver.switchTo().frame(frameElement);
        Thread.sleep(1000);
        textBox.clear();
        Thread.sleep(1000);
        textBox.sendKeys("i need a coffee");
    }
}
