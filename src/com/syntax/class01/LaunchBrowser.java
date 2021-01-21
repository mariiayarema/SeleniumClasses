package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");//get are not keeping history
        driver.navigate().to("https://facebook.com");//navigate will keep history
        //navigate will wait until page will be fully loaded
        //navigate have more options like refresh..
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);// pauses the thread for the given millis
        driver.navigate().refresh();
        driver.close();// close current tab
        driver.quit();// will quit whole browser

      //https://saucelabs.com/resources/articles/selenium-tips-css-selectors

    }
}
