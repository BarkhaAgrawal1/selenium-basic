import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
    @Test
    public void dd(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
Select s=new Select(driver.findElement(By.id("drop1" )));
//s.selectByVisibleText("doc 1");
s.selectByIndex(1);




    }
}
