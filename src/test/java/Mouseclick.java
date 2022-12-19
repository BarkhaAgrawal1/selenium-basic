import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouseclick {
    @Test
public void ms(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        Actions task = new Actions(driver);
        WebElement fullname = driver.findElement(By.id("userName"));
        fullname.sendKeys("Barkha Agrawal");
WebElement email = driver.findElement(By.id("userEmail"));
email.sendKeys("abc@gmail.com");
WebElement currentaddress = driver.findElement(By.id("currentAddress"));
currentaddress.sendKeys("my address");
task.keyDown(Keys.CONTROL);
task.sendKeys("a");
task.keyUp(Keys.CONTROL);
task.build().perform();
task.keyDown(Keys.CONTROL);
        task.sendKeys("c");
        task.keyUp(Keys.CONTROL);
        task.build().perform();
        task.sendKeys(Keys.TAB);
        task.build().perform();
        task.keyDown(Keys.CONTROL);
        task.sendKeys("v");
        task.keyUp(Keys.CONTROL);
        task.build().perform();





    }







}


