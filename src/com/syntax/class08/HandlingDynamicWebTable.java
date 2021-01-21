package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandlingDynamicWebTable {
    public static String url="http:secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

       WebElement username=driver.findElement(By.xpath("//input[contains(@name, 'username')]"));
       username.sendKeys("Tester");
        WebElement password=driver.findElement(By.xpath("//input[@type = 'password']"));
        password.sendKeys("test");
        WebElement loginButton=driver.findElement(By.xpath("//input[@value = 'Login']"));
        loginButton.click();
        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
        for (int i = 1; i < rows.size() ; i++) {//starting loop[
            String rowText= rows.get(i).getText();//getting text
            System.out.println(rowText);
            if(rowText.contains("FamilyAlbum")) {//setting a condition to click on checkbox
                List<WebElement> checkBoxes=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[1]"));
                //locating all checkboxes
                checkBoxes.get(i-1).click();//grabbing a single raw checkbox and clicking
                break;
            }

        }

}}
