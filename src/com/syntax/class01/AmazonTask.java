package com.syntax.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonTask {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/pim/addEmployee");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.cssSelector("input#btnLogin")).click();

//        driver.findElement(By.id("firstName")).sendKeys("Omar");
//        driver.findElement(By.id("lastName")).sendKeys("Omaram");
//        Thread.sleep(1000);
//        driver.findElement(By.id("btnSave")).click();
//        String text=driver.findElement(By.id("profile-pic")).getText();
//        System.out.println(text);


    }



    //public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver","chromedriver");

      //  WebDriver driver=new ChromeDriver();
       // driver.get("https://amazon.com/");
       // String url=driver.getCurrentUrl();
        //System.out.println(url);
       // String title= driver.getTitle();
        //System.out.println(title);
    }

