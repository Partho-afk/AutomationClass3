package Windows_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Keyboard_Mouse_funtions {

    WebDriver driver;
    @BeforeTest
    public void setup() throws InterruptedException {

        //web driver internalisation
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/menu.php#");
        driver.manage().window().maximize();
    }


    @Test
    public void hove1(){
        //this testing for hover
        //using normalization funtion inside xpath also using only visual text
        WebElement m= driver.findElement(By.xpath("//a[normalize-space()='Navbar']")); //color detection
        //detekting the precent color
        String s=m.getCssValue("color");
        System.out.println("rgba color element:  "+s);

        //Create a object for action class this action will perform hovering
        Actions a = new Actions(driver); // calling action for hovering
        //build-- collect all the steps into a single sequence
        a.clickAndHold(m).build().perform(); //this is for hovering
        String s2= m.getCssValue("color");
        System.out.println("rgba color element: "+s2);
    }

}
