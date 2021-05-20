package com.syntax.class01;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AmazonTask {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com/#sbfbu=1&pi=");

        //driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/pim/addEmployee");
        driver.manage().window().maximize();
driver.navigate().forward();
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.cssSelector("input#btnLogin")).click();


//        driver.findElement(By.id("menu_pim_viewPimModule")).click();
//        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td[3]/a")).click();
//        Thread.sleep(2000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,500)");
//        Thread.sleep(2000);
//        driver.findElement(By.linkText("Qualifications")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("addSkill")).click();
//        WebElement skillDD=driver.findElement(By.id("skill_code"));
//        Select select=new Select(skillDD);
//        List<WebElement> list=select.getOptions();
//        int size=list.size();
//        for (WebElement lis:list) {
//            System.out.println(lis.getText());
//        }

//        driver.findElement(By.id("firstName")).sendKeys("Omar");
//        driver.findElement(By.id("lastName")).sendKeys("Omaram");
//        Thread.sleep(1000);
//        driver.findElement(By.id("btnSave")).click();
//        String text=driver.findElement(By.id("profile-pic")).getText();
//        System.out.println(text);


    }



    //public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver","chromedriver");

      //  WebDriver driver=new ChromeDriver();
       // driver.get("https://amazon.com/");
       // String url=driver.getCurrentUrl();
        //System.out.println(url);
       // String title= driver.getTitle();
        //System.out.println(title);
    }

