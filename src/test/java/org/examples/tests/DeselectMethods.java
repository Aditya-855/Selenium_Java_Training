package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
        WebElement element=driver.findElement(By.name("FromLB"));
        Select select=new Select(element);
        select.selectByValue("USA");
        select.selectByIndex(3);
        select.selectByVisibleText("Russia");
        select.deselectByValue("USA");
        select.deselectByIndex(3);
        select.deselectAll();
    }
}
