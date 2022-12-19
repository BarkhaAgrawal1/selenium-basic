import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locator {
    @Test
    public void locate() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement a = driver.findElement(By.name("email"));
        a.sendKeys("barkha");
        WebElement b= driver.findElement(By.id("pass"));
        b.sendKeys("goyal");
        Thread.sleep(1000);
        driver.findElement(By.linkText("Forgot password?")).click();
        Thread.sleep(1000);
        WebElement c = driver.findElement(By.xpath("//input[@type='text']"));
c.sendKeys("agrawal");
Thread.sleep(1000);
WebDriverManager.chromedriver().setup();
WebDriver driver1=new ChromeDriver();
driver1.get("https://www.w3schools.com/java/java_user_input.asp");
WebElement d = driver1.findElement(By.xpath("//a[@id='w3loginbtn']"));
d.click();
driver1.navigate().back();
Thread.sleep(1000);
driver1.close();
WebDriverManager.chromedriver().setup();
WebDriver driver2= new ChromeDriver();
driver2.get("https://www.facebook.com/");
driver2.findElement(By.xpath("//input[@id='email']"));







    }







}
