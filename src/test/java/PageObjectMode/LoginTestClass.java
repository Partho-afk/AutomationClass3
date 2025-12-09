package PageObjectMode;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestClass extends BaseClass{

    //here i am inshilizing Loginclass and second one is class variable "loginclass"
    private LoginClass loginClass;

    //this extentReports for report generation
    private ExtentReports extent;

    //here I am calling the driver from the Loginclass which I declared inside the constructor
    @BeforeMethod
    public void pageSetup(){

        loginClass = new LoginClass(driver);
    }

    //this thing for report generation
    @BeforeTest
    public void configReport(){
        String path = System.getProperty("user.dir") + "\\reports\\index.html";

        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("swag Labs automation report");
        reporter.config().setDocumentTitle("Test Results:: ");

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "Partho");
    }

    @Test
    public void invalidPassword(){

        //for reporting
        extent.createTest("Invalid Password Test case");

        loginClass.usernameInput("standard_user");
        loginClass.enterpasswordInput("12345r");
        loginClass.clicklogin();

        //doing assertion for actual and expected result
        String actualErrorMessage= loginClass.geterrorMessage();
        String expectedErrorMessage= "Epic sadface: Username and password do not match any user in this service";

        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch");

        //for repor closing
        extent.flush();

    }

    @Test
    public void invalidID(){
        loginClass.usernameInput("sdikjfghisdufg");
        loginClass.enterpasswordInput("secret_sauce");
        loginClass.clicklogin();

    }

    @Test
    public void invalidIdAndPass(){
        loginClass.usernameInput("sdikjfghisdufg");
        loginClass.enterpasswordInput("iwaesudtfasdkhfgasdtg");
        loginClass.clicklogin();
    }

    @Test
    public void ValidIdAndPass(){
        loginClass.usernameInput("standard_user");
        loginClass.enterpasswordInput("secret_sauce");
        loginClass.clicklogin();
    }

    @Test
    public void ValidIdAndPass2(){
        loginClass.usernameInput("performance_glitch_user");
        loginClass.enterpasswordInput("secret_sauce");
        loginClass.clicklogin();
    }
}
