package com.zzzz.tests.day3;

import com.zzzz.utilities.WebDriverFactory;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class verifyURLchanged {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        String currentUrl = driver.getCurrentUrl();

        driver.findElement(By.name("email")).sendKeys("mikesmith@gmail.com");

        driver.findElement(By.id("form_submit")).click();


        String actualUrl = driver.getCurrentUrl();
        String expectedURL ="http://practice.cybertekschool.com/email_sent";

        Assert.isTrue(true, expectedURL,actualUrl);

        if(actualUrl.equalsIgnoreCase(expectedURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }




        driver.quit();


    }


}

