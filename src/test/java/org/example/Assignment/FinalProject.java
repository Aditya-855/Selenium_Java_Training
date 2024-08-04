package org.example.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class FinalProject {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\adity\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@title='My Account']")).click();
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
        driver.findElement(By.id("input-email")).sendKeys("patebij@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("test@123");
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        WebElement LaptopsNoteBooksMenu=driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
        WebElement AllLaptopsNoteBooksLink=driver.findElement(By.xpath("//a[text()='Show AllLaptops & Notebooks']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(LaptopsNoteBooksMenu).click(AllLaptopsNoteBooksLink).build().perform();

        driver.findElement(By.xpath("(//span[text()='Add to Cart'])[3]")).click();
        driver.findElement(By.xpath("(//span[text()='Add to Cart'])[4]")).click();
        driver.findElement(By.xpath("//a[@title='Shopping Cart']")).click();
        String product1_text=driver.findElement(By.xpath("(//a[contains(@href,'product_id=44')])[4]")).getText();
        String product2_text=driver.findElement(By.xpath("(//a[contains(@href,'product_id=45')])[4]")).getText();
        if (product1_text.equals("MacBook Air")){
            System.out.println("Product 1 Text is Displayed Correctly :) ");
        }else {
            System.out.println("Product 1 Text is Not Displayed Correctly :( ");
        }
        if (product2_text.equals("MacBook Pro")){
            System.out.println("Product 2 Text is Displayed Correctly :) ");
        }else {
            System.out.println("Product 2 Text is Not Displayed Correctly :( ");
        }

        String TotalAmount=driver.findElement(By.xpath("(//table[@class='table table-bordered'])[3]//tr[2]/td[2]")).getText();
        if (TotalAmount.equals("$3,000.00")){
            System.out.println("Total Amount is Correct :) ");
        }else {
            System.out.println("Total Amount is Not Correct :( ");
        }
        driver.findElement(By.xpath("//a[text()='Checkout']")).click();
       // driver.quit();
    }
}
