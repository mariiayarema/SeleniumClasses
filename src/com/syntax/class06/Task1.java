package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static String url="http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame("FrameOne");

        WebElement frameHeader=driver.findElement(By.xpath("//a[text()='SYNTAX TECHNOLOGIES ']"));
        Thread.sleep(1000);
        boolean isHeaderDisplayed=frameHeader.isDisplayed();
        Thread.sleep(1000);
        System.out.println("Is header displayed"+isHeaderDisplayed);

        driver.switchTo().defaultContent();

        WebElement secondFrame=driver.findElement(By.xpath("//a[@href='https://www.syntaxtechs.com/enroll/']"));;
        Thread.sleep(1000);
        driver.switchTo().frame(secondFrame);
        Thread.sleep(1000);
        WebElement enrollTodayButton=driver.findElement(By.linkText("Enroll Today"));
        Thread.sleep(1000);
        boolean isEnrollTodayEnable=enrollTodayButton.isEnabled();
        System.out.println("Is Enroll Enable "+isEnrollTodayEnable);

    }
}
