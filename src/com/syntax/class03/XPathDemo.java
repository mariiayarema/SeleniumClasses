package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
        driver.quit();
    }
}
