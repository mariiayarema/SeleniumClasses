package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.get("http://syntaxtechs.com/selenium-practice/basic-radiobutton-demo.php");
        //Any element can be stored in WebElement
        WebElement ageRadioButton=driver.findElement(By.xpath("//input[@value='0 - 5']"));
        //finding that element and returning this element
        boolean isEnable=ageRadioButton.isEnabled();
        boolean isDisplayed=ageRadioButton.isDisplayed();
        System.out.println(isDisplayed);
        System.out.println(isDisplayed);

        System.out.println("Before clicking "+ageRadioButton.isSelected());
        ageRadioButton.click();
        System.out.println("After clicking "+ageRadioButton.isSelected());
    }
}
