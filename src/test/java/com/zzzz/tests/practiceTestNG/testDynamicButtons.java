package com.zzzz.tests.practiceTestNG;

import com.zzzz.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testDynamicButtons {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

    }

    @Test
    public void test1(){
        WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));
        Assert.assertFalse(inputBox.isEnabled(), "verify it is not enabled");

        driver.findElement(By.xpath("//button[@onclick='swapInput()']")).click();

        inputBox.sendKeys("something");



    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
