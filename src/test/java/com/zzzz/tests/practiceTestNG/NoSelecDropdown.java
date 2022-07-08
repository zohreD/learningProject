package com.zzzz.tests.practiceTestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class NoSelecDropdown {

    WebDriver driver = null;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    public void test1(){
        driver.get("");


    }


    @AfterMethod
    public void tearDown(){driver.quit();}

}
