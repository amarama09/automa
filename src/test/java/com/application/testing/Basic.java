package com.application.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class Basic{


    @BeforeSuite
    public void runBeforeSuite(){
        System.out.println("I am the Very first , since i run Before suite");
    }



    WebDriver driver;
   /*
   *
   * self@gmail.com
   * 123456
   * */

    @BeforeTest
    public  void runBeforeTestingBegind(){

        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");

    }

    @BeforeMethod
    public void beforeEveryTestMethod(){

        System.out.println( "Before every test method ...");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://newtours.demoaut.com/mercurysignon.php");
        System.out.println("run before testing begins");


    }

    @AfterMethod
    public void afterEveryMethod(){
        driver.quit();
    }

    @Test
    public void someTest(){

        System.out.println("someTest " +
                "ran");


    }

    @Test
    public void getSomeTest() {

        System.out.println("some other test ran");
    }
}