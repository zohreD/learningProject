package com.zzzz.tests.practiceTestNG;

import com.zzzz.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class practiceRadioButtons {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");

    }

    @Test
    public void test1(){
        Assert.assertTrue(driver.findElement(By.id("blue")).isSelected());

        WebElement redButton = driver.findElement(By.id("red"));
        redButton.click();
        Assert.assertTrue(redButton.isSelected(),"red button is selected");




    }
    @Test
    public void test2(){
        Assert.assertFalse(driver.findElement(By.id("green")).isEnabled(), "green button is not enabled");

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }





}
