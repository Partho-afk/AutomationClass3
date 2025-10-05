package TestWebelemets;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUpload {

    WebDriver driver;
    //annotation
    @BeforeTest
    public void setup(){
        //web driver internalisation


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //driver.get("https://portal.reliefvalidation.com.bd/");
        //driver.get("https://www.saucedemo.com/");
        driver.get("https://trytestingthis.netlify.app/");
        //driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.manage().window().maximize();
    }
    @Test(description = "This is for file upload testing")
    public void fileupload(){
        driver.findElement(By.id("myfile")).sendKeys("D:\\partho\\Office\\Doc1.pdf");
    }
}
