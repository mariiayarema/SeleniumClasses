package com.syntax.class11;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class JSExecutorDemo3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        //opening separate windows through JSExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open();");
        driver.navigate().to("https://www.google.com/");

    }
}
