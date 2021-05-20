package EugeneSelenium.reviewclassselenium05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.util.concurrent.TimeUnit;


public class RevieTables {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/mariiayarema/eclipse-workspace/Selenium/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement pass=driver.findElement(By.id("txtPassword"));
        pass.sendKeys("Hum@nhrm123");
        WebElement logIn =driver.findElement(By.id("btnLogin"));
        logIn.click();
        //a[@id='menu_pim_viewPimModule']
        //driver.findElement(By.id("menu_pim_viewPimModule")).click();
        WebElement PIMbtn=CommonMethods.FindElementByXpath(driver,"//a[@id='menu_pim_viewPimModule']");
        Thread.sleep(5000);
        PIMbtn.click();
    }


}
