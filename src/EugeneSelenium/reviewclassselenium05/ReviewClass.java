package EugeneSelenium.reviewclassselenium05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ReviewClass {
    public static String url="";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/mariiayarema/eclipse-workspace/Selenium/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver,20);
        driver.get(url);

        List<WebElement> tablerows=driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));
        int size=tablerows.size();

        System.out.println(size);

        WebElement nxtbtn=driver.findElement(By.xpath("//a[@class='next_link']"));

        boolean flag=true;


        for(WebElement row:tablerows){
            System.out.println(row.getText());
        }
        nxtbtn.click();
        for(WebElement row:tablerows){
            System.out.println(row.getText());
        }
        nxtbtn.click();
        for(WebElement row:tablerows){
            System.out.println(row.getText());
        }

    }
}
