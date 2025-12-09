package PageObjectMode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseClass {

    public WebDriver driver;

    @BeforeMethod()

    public void setup(){
        //Setup browser webrdiever initialization for common functionalities
        WebDriverManager.chromedriver().setup();
        driver  = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod()
    public void quit(){
        if (driver != null){
            driver.quit();
        }
    }
}
