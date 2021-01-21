package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandling {
    public static String url="https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        String mainPageHandle=driver.getWindowHandle();
        System.out.println("Parent handle"+mainPageHandle);
        driver.manage().window().maximize();
        WebElement helpLink=driver.findElement(By.linkText("Help"));
        helpLink.click();

        Set<String> allWindowHandles=driver.getWindowHandles();
        //will automatically return LinkedHashSet
        System.out.println(allWindowHandles.size());
        Iterator<String> iterator=allWindowHandles.iterator();
        mainPageHandle=iterator.next();//stepping forward to the main page
        String childHandle=iterator.next();//stepping forward to child page
        System.out.println("Child handle"+childHandle);
        driver.switchTo().window(mainPageHandle);
        Thread.sleep(2000);
        }
    }

