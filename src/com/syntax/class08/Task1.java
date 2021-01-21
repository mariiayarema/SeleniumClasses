package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {
    public static String url="http://syntaxtechs.com/selenium-practice/dynamic-elements-loading.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        WebElement startButtonElement=driver.findElement(By.id("startButton"));
        startButtonElement.click();

        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']")));

        WebElement startButtonTextElement=driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        //or xpath---- //h4[contains(text(),'Welcome')]
        String startButtonText=startButtonTextElement.getText();
        System.out.println(startButtonText);


    }
}
