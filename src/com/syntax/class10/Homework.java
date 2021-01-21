package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Homework {

    private static boolean flag = true;
    private static WebElement nextButton;
    private static Select select;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aa.com/homePage.do");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //scrolling down
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");


//        WebElement destination=driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
//        destination.sendKeys("New York");

        //selecting from where
        driver.findElement(By.xpath("//a[@data-for = 'reservationFlightSearchForm.originAirport']")).click();
        WebElement fromDD = driver.findElement(By.id("countryCode"));
        select = new Select(fromDD);
        select.selectByVisibleText("Norway");
        driver.findElement(By.xpath("//span[text()='BGO']")).click();

        //selecting to where
        driver.findElement(By.xpath("//a[@data-for = 'reservationFlightSearchForm.destinationAirport']")).click();
        WebElement toDD = driver.findElement(By.id("countryCode"));
        select = new Select(toDD);
        select.selectByVisibleText("New Zealand");
        driver.findElement(By.xpath("//span[text()='DUD']")).click();

        //selecting departure month
        WebElement depCalendar = driver.findElement(By.id("aa-leavingOn"));
        depCalendar.click();
        WebElement depMonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"));
        String depMonthText = depMonth.getText();
        WebElement nextBtn;

        while (!depMonthText.equals("May")) {
            nextBtn = driver.findElement(By.xpath("//a[@data-handler='next']"));
            nextBtn.click();

            depMonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"));
            depMonthText = depMonth.getText();
        }

        //entering departure date
        List<WebElement> departureCalendar = driver.findElements(By.xpath("//div[@class = 'ui-datepicker-group ui-datepicker-group-first']//table//tbody//tr//td"));
        for (WebElement date : departureCalendar) {
            if (date.getText().equals("7")) {
                date.click();
                break;
            }
        }

        //entering arrival date

        WebElement arrCalendar = driver.findElement(By.id("aa-returningFrom"));
        arrCalendar.click();
        WebElement arrMonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"));
        String arrMonthText = arrMonth.getText();
        while (!arrMonthText.equals("June")) {
            nextBtn = driver.findElement(By.xpath("//a[@data-handler='next']"));
            nextBtn.click();

            arrMonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"));
            arrMonthText = arrMonth.getText();
        }

        List<WebElement> departureCalendar2 = driver.findElements(By.xpath("//div[@class = 'ui-datepicker-group ui-datepicker-group-first']//table//tbody//tr//td"));
        for (WebElement date2 : departureCalendar2) {
            if (date2.getText().equals("8")) {
                date2.click();
                break;
            }
        }


        driver.findElement(By.id("flightSearchForm.button.reSubmit")).click();
        driver.quit();
    }
}
