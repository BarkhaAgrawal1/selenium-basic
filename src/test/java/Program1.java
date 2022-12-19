import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program1 {
    @Test
    public void hello(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");

WebDriverManager.chromedriver().setup();
WebDriver driver1 = new ChromeDriver();
driver1.get("http://www.whiteboxqa.com/schedule.php");


    }






}
