package Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class afterannotationcalass4 {

    @AfterTest
    public void aftertest()
    {
        System.out.println("I am calling from class 4 as a aftertest");
    }

//    @AfterClass
//    public void afterclass()
//    {
//        System.out.println("I am calling from class4 as a after class");
//    }

    @Test
    public void method1()
    {
        System.out.println("I am calling from class4 as a method 1");
    }

    @Test
    public void method2()
    {
        System.out.println("I am calling from class4 as a method 2");
    }
}
