package Windows_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NavigationClass {

    WebDriver driver;

    @BeforeTest
    public void setup() throws InterruptedException {
        //web driver internalisation


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        //Thread.sleep(3000);

//        //browser refresh
//        driver.navigate().refresh();

//        //For back button
//        Thread.sleep(3000);
//        driver.navigate().back();
//
//        //For forword from back in the browsewr tab
//        Thread.sleep(3000);
//        driver.navigate().forward();
//
//        //for new window Tab
//        driver.switchTo().newWindow(WindowType.WINDOW);
//        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        //this is for mobile or tab view
        driver.manage().window().setSize(new Dimension(400,814));
    }

    @Test
    public void Navigation(){
        System.out.println("Navigation Window");
    }
}
