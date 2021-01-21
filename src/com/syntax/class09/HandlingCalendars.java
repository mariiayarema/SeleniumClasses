package com.syntax.class09;

import com.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingCalendars extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        setUp();

        WebElement username = driver.findElement(By.xpath("//input[@id = 'txtUsername']"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@name = 'txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.xpath("//input[@id = 'btnLogin']"));
        loginButton.click();
        WebElement leaveButton = driver.findElement(By.id("menu_leave_viewLeaveModule"));
        leaveButton.click();
        WebElement leaveListButton = driver.findElement(By.linkText("Leave List"));
        leaveListButton.click();
        WebElement fromCalendar = driver.findElement(By.id("calFromDate"));
        fromCalendar.click();

        WebElement mDD = driver.findElement(By.className("ui-datepicker-month"));
        Select monthDD = new Select(mDD);
        monthDD.selectByVisibleText("Jul");
        WebElement yDD = driver.findElement(By.className("ui-datepicker-year"));
        Select yearDD = new Select(yDD);
        yearDD.selectByVisibleText("2021");

        List<WebElement> fromDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement fromDate : fromDates) {
            if (fromDate.getText().equals("4")) {
                fromDate.click();
                break;
            }
        }


        WebElement calendarIcon = driver.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[2]"));
        calendarIcon.click();
        WebElement monthDD2 = driver.findElement(By.cssSelector("select.ui-datepicker-month"));
        Select select = new Select(monthDD2);
        select.selectByVisibleText("Aug");
        WebElement yearDD2 = driver.findElement(By.cssSelector("select.ui-datepicker-year"));
        Select select2 = new Select(yearDD2);
        select2.selectByVisibleText("2021");
        List <WebElement> calendarCells=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

        for (WebElement cell:calendarCells) {
            if(cell.getText().equals("4")){
                cell.click();
                break;
            }
        }


        List <WebElement> checkboxes=driver.findElements(By.id("leaveList_chkSearchFilter_checkboxgroup"));
        Thread.sleep(2000);
        for (WebElement checkbox:checkboxes) {
            Thread.sleep(2000);
            System.out.println(checkbox.getText());
            Thread.sleep(2000);
            if(checkbox.getText().equals("Rejected")||checkbox.getText().equals("Cancelled")){
                Thread.sleep(2000);
                checkbox.click();
                Thread.sleep(2000);

            }

        }

    }
}
