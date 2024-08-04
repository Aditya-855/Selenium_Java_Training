package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathSelectorStartWithMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo");
        driver.manage().window().maximize();
        if ( driver.findElement(By.xpath("//img[starts-with(@title,'Canon')]")).isDisplayed()){
            System.out.println("ELEMENT IS DISPLAYED ON THE PAGE");
            driver.findElement(By.xpath("//img[starts-with(@title,'Canon')]")).click();
        }
        //driver.findElement(By.xpath("//img[starts-with(@title,'Canon')")).click();
    }
}
