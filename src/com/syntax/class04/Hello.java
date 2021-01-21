package com.syntax.class04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {
    public static void main(String[] args) throws InterruptedException {
        //https://saucelabs.com/resources/articles/selenium-tips-css-selectors
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://www.google.com/");
        driver.navigate().to("http://18.232.148.34/humanresources/symfony/web/index.php/");



        /*
         CARROT SIGN FOR START_WITH SCC SELECTORS
             input[id^='btn']
             div[id^='divP']
         */

        /*
        DOLLAR SYMBOL FOR END WITH for SCC SELECTORS
        div[style$='-align: center']
         */
    }
}
