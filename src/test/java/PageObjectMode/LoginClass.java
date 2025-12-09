package PageObjectMode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginClass {

    private WebDriver driver;

    By usernameInput= By.id("user-name"); //here first By is a Abstract class it's use a data type

    By userPassInput= By.id("password");

    By loginButton= By.id("login-button");

    By errorMessage= By.cssSelector("h3[data-test='error']");


    //here using constructor so that we can use all the method inside loginclass accessing all including all private
    //here class and constructor name are same
    public LoginClass(WebDriver driver){

        this.driver=driver;
    }

    //webalment action declaring
    public void usernameInput(String username){

        driver.findElement(usernameInput).sendKeys(username);
    }

    public void enterpasswordInput(String password){

        driver.findElement(userPassInput).sendKeys(password);
    }

    public void clicklogin(){

        driver.findElement(loginButton).click();
    }

    public String geterrorMessage(){

      return  driver.findElement(errorMessage).getText();
    }
}
