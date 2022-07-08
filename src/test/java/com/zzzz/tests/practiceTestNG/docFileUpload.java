package com.zzzz.tests.practiceTestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class docFileUpload {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//a[.=\"English\"]")).click();
        driver.findElement(By.xpath("//a[.=\"Gmail\"]")).click();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void test1(){

        driver.findElement(By.xpath("//a[@data-action=\"sign in\"]")).click();
        WebElement emailBox = driver.findElement(By.cssSelector("input[type=\"email\"]"));
        emailBox.sendKeys("zdurdyyewa@gmail.com");

        driver.findElement(By.xpath("//span[.=\"Next\"]")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("input[type=\"password\"]"))));

        driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("Aynamaya1986");
        driver.findElement(By.xpath("//span[.=\"Next\"]")).click();

        driver.findElement(By.xpath("div[.=\"Compose\"]/div[@role=\"button\"]")).click();


        //driver.findElement(By.xpath("//*[@id=\":20s\"]"));

    }

    @Test
    public void test2(){

        String projectPath = System.getProperty("user.dir");
        String filePath = "src/test/resources/textfile.txt";
        String fullPath = projectPath + "/" + filePath;

        System.out.println(fullPath);


    }


}
