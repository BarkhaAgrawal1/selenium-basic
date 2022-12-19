import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigatecommands {

    @Test
    public void navi() throws InterruptedException {
     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     driver.get("https://mail.google.com/mail/u/0/#inbox");
     Thread.sleep(2000);
     driver.navigate().to("http://www.whiteboxqa.com/index.php");
     Thread.sleep(2000);
     driver.navigate().back();
     Thread.sleep(1000);
     driver.navigate().forward();
     Thread.sleep(2000);
     driver.navigate().refresh();
     Thread.sleep(3000);
     driver.close();








    }




}
