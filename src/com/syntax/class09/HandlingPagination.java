package com.syntax.class09;

import com.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandlingPagination extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        setUp();

        WebElement username = driver.findElement(By.xpath("//input[@id = 'txtUsername']"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@name = 'txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.xpath("//input[@id = 'btnLogin']"));
        loginButton.click();
        Thread.sleep(2000);
        WebElement PIM = driver.findElement(By.id("menu_pim_viewPimModule"));
        Thread.sleep(2000);
        PIM.click();
        Thread.sleep(2000);
        WebElement addEmployee = driver.findElement(By.id("menu_pim_addEmployee"));
        Thread.sleep(2000);

        addEmployee.click();
        Thread.sleep(2000);
        WebElement firstNameAdd = driver.findElement(By.id("firstName"));
        Thread.sleep(2000);
        firstNameAdd.sendKeys("zzzzzzzzz");
        Thread.sleep(2000);
        WebElement lastNameField = driver.findElement(By.id("lastName"));
        Thread.sleep(2000);
        lastNameField.sendKeys("zzzzzzzzzzzzzzzz");
        Thread.sleep(2000);
        WebElement empIdField = driver.findElement(By.id("employeeId"));
        Thread.sleep(2000);
        String eplId = empIdField.getAttribute("value");
        Thread.sleep(2000);
        WebElement saveButton = driver.findElement(By.id("btnSave"));
        Thread.sleep(2000);
        saveButton.click();
        Thread.sleep(2000);
        WebElement employeeList = driver.findElement(By.linkText("Employee List"));
        Thread.sleep(2000);
        employeeList.click();



        boolean flag = true;

        while (flag) {

            List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
            for (int i = 0; i < tableRows.size(); i++) {
                String rowText = tableRows.get(i).getText();
                if (rowText.contains(eplId)) {
                    flag = false;
                    Thread.sleep(2000);
                    WebElement checkbox=driver.findElement(By.xpath("//table [@id = 'resultTable']/tbody/tr["+i+"]/td[1]"));
                    Thread.sleep(2000);
                    checkbox.click();
                    Thread.sleep(2000);
                    WebElement deleteButton=driver.findElement(By.id("btnDelete"));
                    Thread.sleep(2000);
                    deleteButton.click();
                    Thread.sleep(2000);
                    WebElement confirmDelete=driver.findElement(By.id("dialogDeleteBtn"));
                    Thread.sleep(2000);
                    confirmDelete.click();

                    break;
                }
            }
            WebElement nextButton = driver.findElement(By.linkText("Next"));
            nextButton.click();
        }


    }
}
