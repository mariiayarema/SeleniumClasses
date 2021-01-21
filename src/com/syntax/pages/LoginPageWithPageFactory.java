package com.syntax.pages;

import com.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory extends CommonMethods {

    @FindBy(id = "txtUsername")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@id='txtPassword']")
    public WebElement passwordTextBox;

    @FindBy(css = "input#btnLogin")
    public WebElement loginButton;

    //constructor to initialize variables

    public LoginPageWithPageFactory(){
        PageFactory.initElements(driver,this);
       
    }

}
