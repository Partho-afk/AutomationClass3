package Annotation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testclass2 {

    @BeforeTest
    public void btest1()
    {
        System.out.println("I am calling from class 2 as a before test");
    }

    @BeforeMethod
    public void bmethod()
    {
        System.out.println("I am calling from class2 as before method");
    }

    @Test
    public void demo1()
    {
        System.out.println("I am from class 2 method1(demo1)");
    }

    @Test
    public void demo2()
    {
        System.out.println("I am from class 2 method2(demo2)");
    }
}
