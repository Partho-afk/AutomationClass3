package Annotation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testclass1 {

    @BeforeSuite
    public void suite()
    {
        System.out.println("I am calling from before suite 'high'"); //high priority
    }

    @BeforeClass
    public void bclass()
    {
        System.out.println("I am calling from testclass 1 as a before class");
    }

    @Test(groups = {"Smoke"})
    public void demo1()
    {
        System.out.println("i am from class 1 method1(demo1)");
    }

    @Test
    public void demo2()
    {
        System.out.println("i am from class 1 method2(demo2)");
    }
}
