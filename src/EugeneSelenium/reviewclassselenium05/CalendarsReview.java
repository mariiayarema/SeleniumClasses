package EugeneSelenium.reviewclassselenium05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class CalendarsReview {
    public static String url="https://www.aa.com/homePage.do";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/mariiayarema/eclipse-workspace/Selenium/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);

        WebElement calendar=driver.findElement(By.xpath("//input[@id='aa-leavingOn']"));
        calendar.click();

        WebElement month=CommonMethods.FindElementByXpath(driver,"//span[@class='ui-datepicker-month']");
        System.out.println(month.getText());

        WebElement nextButton=CommonMethods.FindElementByXpath(driver,"//a[@class='ui-datepicker-next ui-corner-all']");

        while(!month.equals("July")){

            nextButton.click();

        }
    }
}
