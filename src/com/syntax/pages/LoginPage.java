package com.syntax.pages;

import com.syntax.textbase.BaseClass;
import com.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends CommonMethods {

    public WebElement usernameField =driver.findElement(By.xpath("//input[@id = 'txtUsername']"));
    public WebElement passwordField =driver.findElement(By.xpath("//input[@name = 'txtPassword']"));
    public WebElement loginButton =driver.findElement(By.xpath("//input[@id = 'btnLogin']"));


}
