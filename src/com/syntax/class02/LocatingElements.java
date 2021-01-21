package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("MariiaYarema");
        driver.findElement(By.id("pass")).sendKeys("1234567");
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);//adding 2 sec to wait not to get an error, cause script is faster then page loading
        driver.findElement(By.linkText("Forgot Password?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();
        driver.quit();

    }
}
