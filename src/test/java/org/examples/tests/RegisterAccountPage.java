package org.examples.tests;

import jdk.swing.interop.LightweightFrameWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RegisterAccountPage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        driver.findElement(By.id("input-firstname")).sendKeys("JOHN");
        driver.findElement(By.id("input-lastname")).sendKeys("SMITH");
        driver.findElement(By.id("input-email")).sendKeys("john.smith@test.com");
        driver.findElement(By.id("input-telephone")).sendKeys("0987654321");
        driver.findElement(By.name("password")).sendKeys("JACK@123");
        driver.findElement(By.name("confirm")).sendKeys("JACK@123");

//        driver.findElement(By.xpath(xpath_Newsletter)).click();
//        driver.findElement(By.name(name_Agree)).click();
//        driver.findElement(By.xpath(xpath_Continue)).click();
        driver.findElement(By.linkText("login page")).click();
        if (driver.findElement(By.linkText("Login")).isDisplayed()){
            System.out.println("LOGIN LINK IS DISPLAYED");
        }else {
            System.out.println("LOGIN LINK IS NOT DISPLAYED");
        }
        driver.navigate().back();
        driver.findElement(By.partialLinkText("login")).click();
        if (driver.findElement(By.partialLinkText("Login")).isDisplayed()){
            System.out.println("LOGIN LINK IS DISPLAYED");
        }else {
            System.out.println("LOGIN LINK IS NOT DISPLAYED");
        }
        driver.navigate().back();
        driver.findElement(By.tagName("button"));
        List<WebElement> buttons=driver.findElements(By.tagName("button"));
        for (WebElement button:buttons){
            System.out.println(button.getText());
        }
    }
}
