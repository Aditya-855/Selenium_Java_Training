import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        if (title.equals("Google")){
            System.out.println("TITLE IS CORRECT");
        }else {
            System.out.println("TITLE IS INCORRECT");
        }
         driver.quit();
        String signinbutton = "//*[@id=\"gb\"]/div/div[1]/a";
    }
}
