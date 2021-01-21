package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FireFoxTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://amazon.com/");

    }
}

//
//        String url = driver.getCurrentUrl();
//        System.out.println(url);
//        String title = driver.getTitle();
//        System.out.println(title);
