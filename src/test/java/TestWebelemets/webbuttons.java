package TestWebelemets;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class webbuttons {


    WebDriver driver;
    //annotation
    @BeforeTest
    public void setup(){
        //web driver internalisation


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //driver.get("https://portal.reliefvalidation.com.bd/");
        //driver.get("https://www.saucedemo.com/");
        //driver.get("https://trytestingthis.netlify.app/");
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.manage().window().maximize();
    }

//    @Test(description = "This test case for checking the radio button")
//
//    public void radiobutton(){
//
//        WebElement rbutton= driver.findElement(By.id("female"));
//        rbutton.click();
//    }
//
//    @Test(description = "This test case for static drop down button")
//
//    public void sdropdownbutton(){
//
//        WebElement sbutton = driver.findElement(By.id("option"));
//
//        //For select we need to create object every time
//        Select dropdown = new Select(sbutton);
//
//        //we are using select by value
//        //dropdown.selectByValue("option 3");
//
//
//        //we are using Select by visible Text
//        //dropdown.selectByVisibleText("Option 2");
//
//        //we are selecting selectby index it will call using index
//        dropdown.selectByIndex(3);
//    }
//}

@Test(description = "This test case for loop dropdown testting")

public void loopdropdown() throws InterruptedException {

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(3000);


    int i = 1;
        while (i < 4) {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }

    }
}