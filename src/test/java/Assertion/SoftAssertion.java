package Assertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class SoftAssertion {

        WebDriver driver;
        SoftAssert soft;

        //annotation
        @BeforeTest
        public void setup(){
            //web driver internalisation


            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();

        }

        @Test
        public void testwithLogin(){

            //step1 -Login
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();

            //Step2 -Trying multiple soft assertion
            //case-1 -cheking website title
            String actualtitle = driver.findElement(By.className("app_logo")).getText();
            soft.assertEquals(actualtitle, "Swage llbs", "Page title is incorrect"); //wrong title

            //case-2 -cheking url
            String curenturl = driver.getCurrentUrl();
            soft.assertTrue(curenturl.contains("inventory"), "URL does not conyain 'inventory'"); // Url partial text is correctte it will pass


        }
    }

