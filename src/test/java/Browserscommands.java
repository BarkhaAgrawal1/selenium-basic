import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browserscommands{

    @Test
    public void browser() throws InterruptedException {
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.get("https://web.whatsapp.com/");
       Thread.sleep(3000);
       driver.get("https://mail.google.com/mail/u/0/#inbox");
       driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getTitle());
        driver.close();
        driver.quit();







    }





}
