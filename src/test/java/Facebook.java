import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Facebook {

    @Test
    public void signin(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement first = driver.findElement(By.xpath("//input [@name = \"firstname\"]"));
        first.sendKeys("Barkha");
        WebElement last = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
        last.sendKeys("Agrawal");
        //WebElement pass =driver.findElement(By.xpath("//input[@name = \"pass\"]"));
        //pass.sendKeys("barkha@12345");
        WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
        month.click();
        Select s= new Select(month);
        s.selectByVisibleText("Jun");
        WebElement Day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
        Day.click();
        Select s1= new Select(Day);
        s1.selectByVisibleText("17");
        WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
        year.click();
        Select s3= new Select(year);
        s3.selectByVisibleText("2005");
        WebElement gender = driver.findElement(By.xpath("//input[@value = \"1\"]"));
        gender.click();
        driver.findElement(By.xpath("//button[@name = \"websubmit\"]")).click();


    }


}
