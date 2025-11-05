package Thirdparty_Handeler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alerthandeler {


    WebDriver driver;

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

    }

    @Test
    public void command(){
        System.out.println("Chek");
        driver.findElement(By.id("name")).sendKeys("Mr.Omega");
        driver.findElement(By.id("alertbtn")).click();

        //for alert funtion for accept
        driver.switchTo().alert().accept();

        //for alert funtion for dismiss
        driver.findElement(By.cssSelector("#name")).sendKeys("Mr. Prime");
        driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
        driver.switchTo().alert().dismiss();
        driver.close();
    }
}
