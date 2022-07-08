package com.zzzz.tests.day7_TestNG;

import com.zzzz.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class testTestNG {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");

    }
    @Test
    public void test1(){

        driver.get("https://www.ebay.com");
        String searchItem = "java";

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(searchItem);
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        WebElement result = driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']/span"));

        String getText = result.getText();

        System.out.println("getText = " + getText);

        String title = driver.getTitle();

        Assert.assertTrue(title.contains(searchItem));

    }

    @AfterMethod

    public void tearDown(){

        driver.quit();

    }


}
