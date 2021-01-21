package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("u_0_2")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Mariia");
        Thread.sleep(1000);
        driver.findElement(By.name("lastname")).sendKeys("Yarema");
        Thread.sleep(1000);
        driver.findElement(By.id("u_1_g")).sendKeys("6312347600");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("Zaqwsxcde12345^&");

        WebElement monthDD=driver.findElement(By.id("month"));
        Select select=new Select(monthDD);
        select.selectByVisibleText("Aug");
        Thread.sleep(1000);

        WebElement dayDD=driver.findElement(By.id("day"));
        Select select2=new Select(dayDD);
        select2.selectByIndex(21);
        Thread.sleep(1000);

        WebElement yearDD=driver.findElement(By.id("year"));
        Select select3=new Select(yearDD);
        select3.selectByValue("1991");

        driver.findElement(By.xpath("//label[text()='Female']")).click();
        driver.findElement(By.cssSelector("button#u_1_s")).click();
        driver.quit();
    }
}
