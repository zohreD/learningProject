package com.zzzz.tests.practiceTestNG;

import com.zzzz.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dynamicLoadingScreen {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

    }
    @Test
    public void test1(){
        WebElement usernameBox = driver.findElement(By.id("username"));
        Assert.assertFalse(usernameBox.isDisplayed(), "verify that the box isn't displayed");

        driver.findElement(By.xpath("//div[@id='start']/button")).click();

        Assert.assertTrue(usernameBox.isDisplayed(), "verify that username is displayed");



    }



    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
