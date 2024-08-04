package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class IsDisplayesMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.MILLISECONDS);
        if (driver.findElement(By.name("newsletter")).isDisplayed()){
            if(!driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).isSelected()){
                driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
            }
        }
        if (driver.findElement(By.name("agree")).isEnabled()){
            driver.findElement(By.name("agree")).click();
        }
    }
}
