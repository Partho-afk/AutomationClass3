package Assignment1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


import java.time.Duration;

public class baseClass {

    //declaring driver into globally for user we are using access modifire so that we can call from another class
    public WebDriver driver;

    //using beforetest as annotation
    @BeforeMethod(groups = {"Smoke"})
    //this class holds only setup that can be use by other classes
    public void setup(){

        //web driver setup
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        //driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod(groups = {"Smoke"})
    public void quit(){
        if (driver != null){
            driver.quit();
        }
    }

}

/*Assignment-1
Swag Labs Automation:

1. Base Class-SetUp
2. Two Test Classes
   -Postive Login
   -Negative Login

-Group.xml(Pos-1,Neg-2)
-Inlcude.xml(Pos-1,Neg-1)
-Exclude.xml(Neg-1)*/