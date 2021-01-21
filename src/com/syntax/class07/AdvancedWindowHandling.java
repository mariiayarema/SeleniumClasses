package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvancedWindowHandling {
    public static String url="http://syntaxtechs.com/selenium-practice/window-popup-modal-demo.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle=driver.getWindowHandle();
        WebElement instaButton=driver.findElement(By.linkText("Follow On Instagram"));
        WebElement fbButton=driver.findElement(By.linkText("Like us On Facebook"));

        WebElement instaAndFbButton=driver.findElement(By.linkText("Follow Instagram & Facebook"));

        instaButton.click();
        fbButton.click();
        instaAndFbButton.click();

        Set<String> allWindowHandles =driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        Iterator<String> it=allWindowHandles.iterator();
        while(it.hasNext()){//start iterating through handles
            String handles=it.next();//getting next handle
            if(!handles.equals(mainPageHandle)){//set a condition
                Thread.sleep(2000);
                driver.switchTo().window(handles);//switch to a window which is not equal to parent handle
                driver.close();
            }

            driver.switchTo().window(mainPageHandle);
            instaButton.click();


        }

    }
}
