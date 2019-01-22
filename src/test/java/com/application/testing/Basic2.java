package com.application.testing;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic2 {



    @AfterSuite
    public void afterEveryTestMethod(){
        System.out.println("I am the very last");
    }


    @BeforeMethod
    public void beforeEveryTestMethod(){

        System.out.println( "Before every test method ...2");

    }

    @Test
    public void someTest(){

        System.out.println("someTest 2" +
                "ran");


    }

    @Test
    public void getSomeTest() {

        System.out.println("some other test ran 2");
    }
}