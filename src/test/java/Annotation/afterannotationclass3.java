package Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class afterannotationclass3 {

    @AfterSuite
    public void aftersuite()
    {
        System.out.println("I am calling from class3 as a aftter suite ");
    }
    @AfterClass
    public void afterclass()
    {
        System.out.println("I am calling from class3 as a after class");
    }

    @AfterMethod
    public void aftermethod()
    {
        System.out.println("It will be run as a after method");
    }

    @Test(groups = {"Smoke"})
    public void method1()
    {
        System.out.println("I am calling from class3 as a first method");
    }

    @Test
    public void method2()
    {
        System.out.println("I am calling from class3 as a seond method");
    }
}
