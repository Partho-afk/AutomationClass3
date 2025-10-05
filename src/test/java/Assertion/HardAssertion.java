package Assertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HardAssertion {
    WebDriver driver;
    //annotation
    @BeforeTest
    public void setup(){
        //web driver internalisation


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

    }
    //this test is for comparison expected result and actual result so we can find out it's working properly or not
    @Test
    public void hardassertion(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();


        //       String expetedUrl = "https://www.saucedemo.com/inventory.html";
        //       String actualUrl = driver.getCurrentUrl();

        //Assert Equals
        //Assert.assertEquals(expetedUrl, actualUrl, "Urls not same");

        //Assert Not Equals
        //Assert.assertNotEquals(expetedUrl, actualUrl);

        //Assert true

                WebElement text = driver.findElement(By.xpath("//span[@class='title']"));
                Assert.assertTrue(text.isDisplayed());

        //Assert not equal

//        WebElement text = driver.findElement(By.xpath("//span[@class='title']"));
//        Assert.assertFalse(text.isDisplayed());
    }

}
