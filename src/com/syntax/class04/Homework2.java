package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Homework2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.navigate().to("https://www.amazon.com/");
       

        List<WebElement> webElementList=driver.findElements(By.tagName("a"));
        System.out.println(webElementList.size());
        for(WebElement link:webElementList){
           String fullLink=link.getAttribute("href");
           String linkText=link.getText();
           if(!link.equals(null)){
               System.out.println(linkText+" "+fullLink);
           }else{

           }
        }

    }
}
