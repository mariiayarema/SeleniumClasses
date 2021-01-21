package com.syntax.class11;

import com.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JSExecutorDemo extends CommonMethods {
    public static void main(String[] args) {
        setUp();
        WebElement username = driver.findElement(By.xpath("//input[@id = 'txtUsername']"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@name = 'txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.xpath("//input[@id = 'btnLogin']"));

        JavascriptExecutor js=(JavascriptExecutor) driver;

        //highlight with javaExecutor
        js.executeScript("arguments[0].style.backgroundColor='red'",password);

        js.executeScript("argument[0].click()",loginButton);

    }
}
