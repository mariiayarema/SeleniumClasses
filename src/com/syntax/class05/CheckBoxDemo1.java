package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo1 {
    public static String url="http://syntaxtechs.com/selenium-practice/basic-checkbox-demo.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        Thread.sleep(1000);
        driver.get(url);
        Thread.sleep(1000);
        List<WebElement> optionCheckBoxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));
        int optionsCount=optionCheckBoxes.size();
        System.out.println(optionsCount);
       for(WebElement checkBoxOption:optionCheckBoxes){
           if(checkBoxOption.isEnabled()){
               String checkBox=checkBoxOption.getAttribute("value");
               if(checkBox.equalsIgnoreCase("Option-2")){
                   checkBoxOption.click();
                   Thread.sleep(2000);
                   break;

               }
       }






        //optionCheckBoxes.get(1).click()
    }
}
}
