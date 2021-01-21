package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandlingStaticWebTable {
    public static String url="http://syntaxtechs.com/selenium-practice/table-search-filter-demo.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
      List<WebElement> rawData=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        System.out.println(rawData.size());
        Iterator<WebElement> iterator=rawData.iterator();
        while(iterator.hasNext()){
            WebElement row=iterator.next();
            String rowText=row.getText();
            System.out.println(rowText);
        }
        System.out.println("--------------------");
        List<WebElement> columnsData=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
        System.out.println("Number of columns "+columnsData.size());
        for (WebElement col:columnsData) {
           String columnText=col.getText();
            System.out.println(columnText);
        }
    }
}
