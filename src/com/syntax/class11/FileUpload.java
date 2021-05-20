package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FileUpload {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement fileUploadLink=driver.findElement(By.linkText("File Upload"));
        fileUploadLink.click();

        WebElement chooseFile=driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("/Users/mariiayarema/Desktop/Book8.xlsx");
        chooseFile.sendKeys(Keys.TAB);

        WebElement uploadButton=driver.findElement(By.id("file-submit"));
        uploadButton.click();
    }
}
