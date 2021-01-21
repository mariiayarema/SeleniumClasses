package com.syntax.class10;

import com.utils.CommonMethods;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;








public class TakingScreenshots {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http:secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        // driver.manage().window().maximize();
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester", Keys.TAB);
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test",Keys.ENTER);
        // driver.findElement(By.className("button")).click();

        //TakesScreenshot is an interface
        //casting down interface TakingScreenshots to driver
        TakesScreenshot ts=(TakesScreenshot)driver;

        //the screenshot is taken here
        File sourceFile=ts.getScreenshotAs(OutputType.FILE);

        //storing file in a computer
        try {
            FileUtils.copyFile(sourceFile,new File("screenshots/HRMS/adminLogin.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //creating folder where w e gonna keep our screenshots
    }
}