package org.example.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().window().maximize();

        String id_FirstName="input-firstname";
        String id_LastName="input-lastname";
        String id_Email="input-email";
        String id_Telephone="input-telephone";
        String id_Password="input-password";
        String id_ConfirmPwd="input-confirm";
        String xpath_Newsletter="(//input[@name='newsletter'])[1]";
        String name_Agree="agree";
        String xpath_Continue="//input[@value='Continue']";
        String xpath_Text="//div[@id='content']//p";

        driver.findElement(By.id(id_FirstName)).sendKeys("JACK");
        driver.findElement(By.id(id_LastName)).sendKeys("WILLIAMS");
        driver.findElement(By.id(id_Email)).sendKeys("jack.williams@test2.com");
        driver.findElement(By.id(id_Telephone)).sendKeys("0987654321");
        driver.findElement(By.id(id_Password)).sendKeys("JACK@123");
        driver.findElement(By.id(id_ConfirmPwd)).sendKeys("JACK@123");

        driver.findElement(By.xpath(xpath_Newsletter)).click();
        driver.findElement(By.name(name_Agree)).click();
        driver.findElement(By.xpath(xpath_Continue)).click();

        String actualText=driver.findElement(By.xpath(xpath_Text)).getText();
        if (actualText.equals("Congratulation!Your new account has been successfully created!")){
            System.out.println("EXPECTED TEXT MATCHES WITH ACTUAL TEXT");
        }else {
            System.out.println("EXPECTED TEXT DOESN'T MATCHES WITH ACTUAL TEXT");
        }


    }
}
