package seconelocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLocators {

    WebDriver driver;
    @BeforeTest
    public void setup(){
        //web driver internalisation

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //driver.get("https://portal.reliefvalidation.com.bd/");
        driver.get("https://www.saucedemo.com/");
        //driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
    }

    @Test
    public void loginSauceDemo(){
        //System.out.println("I am stupid");
        //here (id) is locator that has been used for calling
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        //here (Name) is attribute which is also a locator
//        driver.findElement(By.name("user-name")).sendKeys("standard_user");
//        driver.findElement(By.name("password")).sendKeys("secret_sauce");
//        driver.findElement(By.name("login-button")).click();


        //using two class name so using css selector
//      driver.findElement(By.cssSelector(".input_error.form_input")).sendKeys("standard_user");

//        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("protimpathodebug@gmail.com");
//        driver.findElement(By.id("password")).sendKeys("Partho@123");
//        driver.findElement(By.id("kc-login")).click();
//        driver.manage().window().maximize();

        //linktext
        //driver.findElement(By.linkText("Forgot your password?")).click();

        //Xpath
        //Xpath using tag and attribute
//        driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Partho");
//
//        //Xpath using Contains() funtion [it's work like partial link text]
//        driver.findElement(By.xpath("//input[contains(@name,'Password')]")).sendKeys("1234");
//
//        //Xpath using starts with(starts-with) [it worklike what the value fist holding it's take and worklike that]
//        //driver.findElement(By.xpath("//button[starts-with(@id,'visitUs')]")).click();
//
//        //Xpath using text matching
//        driver.findElement(By.xpath("//button[text()='Sign In']")).click();

//        //Xpath using partial text
//        driver.findElement(By.xpath("//a[contains(text(), 'password')]")).click();
//
//        //Xpath using relative with Index type
//        driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("partho");

        //CSS seletors

//        driver.findElement(By.cssSelector(".input_error.form_input")).sendKeys("Partho");
//
//        //CSS selector using ID
//        driver.findElement(By.cssSelector("#password")).sendKeys("1234");
//
//        //CSS selecot using attribute value
//        driver.findElement(By.cssSelector("[name='login-button']")).click();

  //      driver.findElement(By.cssSelector("input[type='text'].input_error")).sendKeys("Partho");

    }
}
