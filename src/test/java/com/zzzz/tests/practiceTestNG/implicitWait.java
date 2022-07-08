package com.zzzz.tests.practiceTestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class implicitWait {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.skyscanner.co.th/?locale=en-GB");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @AfterMethod
    public void tearDown(){driver.quit();}

    @Test
    public void test1(){

        WebElement from = driver.findElement(By.cssSelector("#fsc-destination-search"));
        from.sendKeys("Bangkok");
        from.sendKeys(Keys.ARROW_DOWN);
        from.sendKeys(Keys.ENTER);


    }
}
