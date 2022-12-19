import com.sun.jdi.ByteValue;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class Win2 {
    @Test
    public void win(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/popup.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[text() = 'Click Here']")).click();
        Set<String> Handles = ( Set<String>)driver.getWindowHandles();
        Iterator<String>it = Handles.iterator();
        String parent = it.next();
        String child = it.next();
        driver.switchTo().window(child);
        driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//input [@type='submit']")).click();
        driver.close();
        driver.switchTo().window(parent);








    }
}
