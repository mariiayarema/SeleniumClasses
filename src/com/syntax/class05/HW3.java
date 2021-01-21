package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HW3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com/");
        WebElement categoriesDD=driver.findElement(By.id("gh-cat"));
        Select select=new Select(categoriesDD);
        List <WebElement> categoriesDDOptions= select.getOptions();
        int sizeCatOptions=categoriesDDOptions.size();

        for (int i = 0; i <sizeCatOptions ; i++) {
            String optionTExt=categoriesDDOptions.get(i).getText();
            System.out.println(optionTExt);
        }


        /* OR
         Iterator<WebElement> iterator=categoriesDDOptions.iterator();
        while(iterator.hasNext()){
            WebElement option=iterator.next();
            String optionText=option.getText();
            System.out.println(optionText);
        }
         */



        /* OR
         for (WebElement option:categoriesDDOptions) {
           String optionText= option.getText();
           System.out.println(optionText);
        }
         */


        select.selectByVisibleText("Computers/Tablets & Networking");
        driver.findElement(By.id("gh-btn")).click();
        WebElement header= driver.findElement(By.xpath("//span[text()='Computers, Tablets & Network Hardware']/parent::h1"));
        boolean isDisplayed=header.isDisplayed();
        System.out.println("Header is displayed-"+isDisplayed);
        driver.quit();
    }
}
