import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class Windowhandles {
    @Test
    public void winhan() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/popup.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
        Set<String> handles = (Set<String>) driver.getWindowHandles();
        Iterator<String >it = handles.iterator();
        String parent = it.next();
        System.out.println(driver.getCurrentUrl());
        String child = it.next();
        System.out.println(driver.getTitle());
        driver.switchTo().window(child);
        driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).sendKeys("xyz@gmail.com");
driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.close();
       driver.switchTo().window(parent);
        System.out.println(driver.getCurrentUrl());





    }
}
