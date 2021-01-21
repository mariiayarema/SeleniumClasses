package com.syntax.class07;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HW1 {
   public static String url="https://demoqa.com/browser-windows";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        //getting main page handle
        String mainPageHandle = driver.getWindowHandle();


        //entering new tab window
        WebElement newTabButton = driver.findElement(By.id("tabButton"));
        newTabButton.click();

        //getting both windows handles
        Set<String> windowHandles1 = driver.getWindowHandles();
        //iterating through both windows
        Iterator<String> iterator1 = windowHandles1.iterator();
        //stepping forward to main page
        mainPageHandle = iterator1.next();
        //stepping forward to child page
        String newTabHandle = iterator1.next();//getting New Tab window handle
        driver.switchTo().window(newTabHandle);//switching to new tab window
        WebElement newTabHeader = driver.findElement(By.id("sampleHeading"));//locating header element
        System.out.println(newTabHeader.getText());//getting header text
        driver.close();

        driver.switchTo().window(mainPageHandle);
        WebElement newWindowButton = driver.findElement(By.id("windowButton"));
        newWindowButton.click();
        Set<String> windowHandles2 = driver.getWindowHandles();
        Iterator<String> iterator2 = windowHandles2.iterator();
        mainPageHandle = iterator2.next();
        String newWindowHandle = iterator2.next();
        driver.switchTo().window(newWindowHandle);
        driver.manage().window().maximize();
        WebElement newWindowHeader = driver.findElement(By.id("sampleHeading"));
        System.out.println(newWindowHeader.getText());
        driver.close();
        Thread.sleep(2000);


        driver.switchTo().window(mainPageHandle);
        WebElement newWindowMessageButton = driver.findElement(By.id("messageWindowButton"));
        newWindowMessageButton.click();
        Set<String> windowHandles3 = driver.getWindowHandles();
        Iterator<String> iterator3 = windowHandles3.iterator();

        mainPageHandle = iterator3.next();
        String newWindowMessageHandle = iterator3.next();
        driver.switchTo().window(newWindowMessageHandle);
        WebElement element=driver.findElement(By.tagName("body"));
        String st=element.getAttribute("textContent");
        System.out.println(st);
        driver.close();
    }

}


