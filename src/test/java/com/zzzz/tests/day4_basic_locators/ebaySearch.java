package com.zzzz.tests.day4_basic_locators;

import com.zzzz.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ebaySearch {

    public static void main(String[] args) {
        String searchItem = "java";

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com");

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(searchItem);
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        WebElement result = driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']/span"));

        String getText = result.getText();

        System.out.println("getText = " + getText);

        String title = driver.getTitle();

        if(title.contains(searchItem)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }




        driver.quit();


    }
}
