package Assignment1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class positive_class extends baseClass {

    //this login holds positive login cases
    @Test
    public void positive_case1() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

    }

    @Test(groups = {"Smoke"})
    public void positive_case2() throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys("problem_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        //driver.quit();
    }
}
