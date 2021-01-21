package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();

        driver.switchTo().frame(0);
        //OR driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        //actions.dragAndDrop(draggable,droppable).perform();
        actions.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
    }
}
