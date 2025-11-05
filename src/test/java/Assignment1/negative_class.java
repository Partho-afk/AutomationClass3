package Assignment1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class negative_class extends baseClass {

    //this login holds negative login cases
    @Test
    public void negative_case1(){
        driver.findElement(By.id("user-name")).sendKeys("partho01");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @Test(groups = {"Smoke"})
    public void negative_case2(){
        //driver.findElement(By.id("user-name")).sendKeys("zyspartho@");
        driver.findElement(By.id("password")).sendKeys("partho123");
        driver.findElement(By.id("login-button")).click();
    }

    @Test(groups = {"Smoke"})
    public void negative_case3(){
        driver.findElement(By.id("user-name")).sendKeys("PPPPPPPP@");
        //driver.findElement(By.id("password")).sendKeys("sheba123");
        driver.findElement(By.id("login-button")).click();
    }
}
