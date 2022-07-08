package com.zzzz.tests.practiceTestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframeTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown(){driver.quit();}

    @Test
    public void test1() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/iframe");

        WebElement iframe= driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframe);

        WebElement textMessage = driver.findElement(By.id("tinymce"));

        driver.findElement(By.xpath("//p")).clear();
        Thread.sleep(3000);
        textMessage.sendKeys("something");

        Assert.assertTrue(textMessage.getText().equalsIgnoreCase("something"));

        driver.switchTo().defaultContent();



    }
    @Test
    public void test2(){

        driver.get("http://practice.cybertekschool.com/nested_frames");


        driver.switchTo().frame(0);

        driver.switchTo().frame(1);

        System.out.println(driver.findElement(By.id("content")).getText());

       driver.switchTo().parentFrame();

       driver.switchTo().frame(2);

        System.out.println(driver.findElement(By.tagName("body")).getText());

        driver.switchTo().defaultContent().switchTo().frame(1);

        System.out.println(driver.findElement(By.tagName("body")).getText());


    }



}
