import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Draganddrop {
    @Test
    public void dd(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/droppable");
           Actions task = new Actions(driver);
        WebElement a  = driver.findElement(By.id("draggable"));
        WebElement b = driver.findElement(By.id("droppable"));
        task.dragAndDrop(a, b).perform();










    }














}
