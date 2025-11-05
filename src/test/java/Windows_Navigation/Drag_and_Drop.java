package Windows_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;

public class Drag_and_Drop {
    WebDriver driver;
    @BeforeTest
    public void setup() throws InterruptedException {

        //web driver internalisation
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");
        driver.manage().window().maximize();
    }

    @Test
    public void DragDropTest(){
        WebElement sourceElement = driver.findElement(By.id("draggable"));
        WebElement targetElement = driver.findElement(By.id("droppable"));


        //Action for drag and drop
        Actions a =  new Actions(driver);
        a.dragAndDrop(sourceElement, targetElement).perform();

        //perform-- actually execute the steps in the browser
    }
}
