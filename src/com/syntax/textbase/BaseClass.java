package com.syntax.textbase;

import com.utils.ConfigsReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass  {
    public static WebDriver driver;

    /**
     * This method will open a browser ,set up configuration and navigate to url
     */

    public static void setUp() {
        ConfigsReader.readProperties("/Users/mariiayarema/eclipse-workspace/Selenium/src/com/Configs/Configuration.properties");
        ConfigsReader.getPropertyValue("browser");
        switch (ConfigsReader.getPropertyValue("browser").toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid browser");
        }
        driver.get(ConfigsReader.getPropertyValue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }



    //java doc
    /**
     * this method will navigate to website by the given URL
     * @param url
     */
    public static void setUpWithSpecificURL(String url){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }









    /**
     * This method will close open browser
     */

    public static void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
}
