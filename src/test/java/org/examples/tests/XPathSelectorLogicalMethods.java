package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathSelectorLogicalMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("test2@test.com");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test123");
        driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();

        driver.findElement(By.xpath("//a[@class='btn btn=primary' or text()='Continue']")).click();

    }
}
