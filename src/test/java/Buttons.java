import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Buttons {
    @Test
    public void ons(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        Actions task = new Actions(driver);
        //WebElement a = driver.findElement(By.id("doubleClickBtn"));
       // WebElement b = driver.findElement(By.id("rightClickBtn"));
        //WebElement c = driver.findElement(By.id("2RzUX")).click();

        //task.doubleClick(a).perform();
//task.contextClick(b).perform();





    }
}
