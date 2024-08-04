package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ClickMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.findElement(By.id("user-name")).clear();
        driver.findElement(By.id("user-name")).click();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("login-button")).click();
        WebDriverWait wait =new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("item_4_title_link"))));
        driver.findElement(By.id("item_4_title_link")).click();
    }
}
