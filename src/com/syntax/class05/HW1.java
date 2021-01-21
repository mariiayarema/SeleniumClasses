package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1 {
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

        //Month DD
        WebElement monthDD=driver.findElement(By.cssSelector("select#month"));//locate dropdown
        Select select=new Select(monthDD);//create select class
        List<WebElement> monthOptions=select.getOptions();
        int monthOptionSize=monthOptions.size();

        // Day DD
        if(monthOptionSize==12){
            System.out.println("Month dd has 12 options");
        }else{
            System.out.println("Month dd has "+monthOptionSize+" options");
        }

        WebElement dayDD=driver.findElement(By.id("day"));
        Select select2=new Select(dayDD);
        List <WebElement> dayDDOptions=select2.getOptions();
        int dayDDSize=dayDDOptions.size();
        if(dayDDSize==31){
            System.out.println("Day dd has 31 options ");
        }else{
            System.out.println("Day dd has "+ dayDDSize+" options");
        }

        //selecting day of birth
        //select2.selectByIndex(21);
        //select2.selectByValue("21");
        select2.selectByVisibleText("21");


        WebElement yearDD=driver.findElement(By.id("year"));
        Select select3=new Select(yearDD);
        List <WebElement> yearDDOptions=select.getOptions();
        int yearDDSize=yearDDOptions.size();
        if(yearDDSize==115){
            System.out.println("Year dd has 115 options");
        }else{
            System.out.println("Year dd has "+yearDDSize+" options");
        }
        driver.quit();
    }
}
