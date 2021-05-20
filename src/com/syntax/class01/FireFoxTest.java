package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class FireFoxTest {
    public static void main(String[] args) {
        /*
        While testing with Selenium, you will make use of the setProperty method because the browser doesn’t have
        a built-in server to run the automation code. In this case, you will need a Chrome/IE/Gecko driver server
        for communicating your Selenium code to the browser.
        In simple words, to set the path of the driver for the respective browser you will need the system.setProperty.
         */
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
