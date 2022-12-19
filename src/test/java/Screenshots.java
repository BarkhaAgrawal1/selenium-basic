import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileStore;

public class Screenshots {
    @Test
    public void screen() throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();


        File Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(Screenshot,new File("C:\\Users\\deepa\\OneDrive\\Desktop\\octpic\sample.png"));



//File Screenshots =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(Screenshots,new File("C:\\Users\\deepa\\OneDrive\\Desktop\\oct2\\Sample2.png"));

        driver.get("https://demoqa.com/automation-practice-form");
        WebElement a  = driver.findElement(By.id("uploadPicture" ));
        a.sendKeys("C:\\Users\\deepa\\OneDrive\\Desktop\\oct2\\sample2.png");


    }







}
