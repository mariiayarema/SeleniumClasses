package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("u_0_2")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Mariia");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("Yarema");
        Thread.sleep(2000);
        driver.findElement(By.id("u_1_g")).sendKeys("6312347600");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("Zaqwsxcde12345^&");
        driver.findElement(By.name("birthday_month")).sendKeys("Aug");
        driver.findElement(By.id("day")).sendKeys("21");
        driver.findElement(By.id("year")).sendKeys("1991");
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.id("u_1_s")).click();
        driver.findElement(By.id("u_1_9")).click();
        driver.quit();
    }
}
