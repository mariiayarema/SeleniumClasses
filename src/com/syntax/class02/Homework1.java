package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.name("customer.firstName")).sendKeys("Mariia");
        driver.findElement(By.id("customer.lastName")).sendKeys("Yarema");
        driver.findElement(By.name("customer.address.street")).sendKeys("6354 Forest Ave, Ridgewood, NY");
        driver.findElement(By.id("customer.address.city")).sendKeys("New York");
        driver.findElement(By.name("customer.address.state")).sendKeys("New York");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("12702");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("6318583990");
        driver.findElement(By.id("customer.ssn")).sendKeys("456367800");
        driver.findElement(By.name("customer.username")).sendKeys("Mariia Yarema");
        driver.findElement(By.name("customer.password")).sendKeys("1234567");
        driver.findElement(By.id("repeatedPassword")).sendKeys("repeatedPassword");
        driver.findElement(By.className("button")).click();
        driver.close();
    }

    }

