package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkXPath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Start')]")).click();
        //OR driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[text() = 'Simple Form Demo'])[2]")).click();
        //OR driver.findElement(By.xpath("//a[contains(@href,'first')]/parent::div")).click();
        //OR driver.findElement(By.xpath("//a[contains(@href,'checkbox')]/preceding-sibling::a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("XPath fun");
        //OR driver.findElement(By.xpath("//label[text()='Enter message']/following-sibling::input")).sendKeys("Syntax Technology");
        //OR driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Hello World");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        //OR driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
        driver.quit();

    }
}
