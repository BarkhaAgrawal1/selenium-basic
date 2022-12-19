import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cselector {

    @Test
    public void selector()throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
          driver.get("https://demoqa.com/automation-practice-form");
          driver.findElement(By.id("firstName")).sendKeys("Barkha");
         Thread.sleep(1000);
        driver.findElement(By.id("lastName")).sendKeys("Goyal");
        driver.findElement(By.id("userEmail")).sendKeys("barkha@gmail.com");
        Thread.sleep(1000);
              //driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
        driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("293948477");
driver.findElement(By.xpath("//label[contains(text(),'Sports')]")).click();





///WebElement b = driver.findElement(By.name("email"));
////b.sendKeys("Selenium");


    }








}
