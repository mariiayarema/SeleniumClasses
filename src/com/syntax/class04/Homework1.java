package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.navigate().to("http://18.232.148.34/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.cssSelector("input#btnLogin")).click();
        WebElement logoElement = driver.findElement(By.xpath("//img[@src='/humanresources/symfony/web/webres_5acde3dbd3adc6.90334155/themes/default/images/syntax.png']"));
        if(logoElement.isDisplayed()){
            System.out.println("Syntax logo is displayed");
        }else{
            System.out.println("Syntax logo is not displayed");
        }
        driver.quit();

        /*
        WebElement logo = driver.findElement(By.cssSelector("img[src *= syntax]"));
System.out.println("Is logo displayed? " + logo.isDisplayed());
         */
    }
}
