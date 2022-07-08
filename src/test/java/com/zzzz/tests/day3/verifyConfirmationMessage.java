package com.zzzz.tests.day3;

import com.zzzz.utilities.WebDriverFactory;
import dev.failsafe.internal.util.Assert;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");


        String currentUrl = driver.getCurrentUrl();

       WebElement email;
        email = driver.findElement(By.name("email"));
        email.sendKeys("mikesmith@gmail.com");

        String actualMail = email.getAttribute("value");

        String expectedMail = "mikesmith@gmail.com";

        Assert.isTrue(true, expectedMail,actualMail);
        System.out.println("actualMail = " + actualMail);
        System.out.println("expectedMail = " + expectedMail);


        if(email.isDisplayed()){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        driver.findElement(By.id("form_submit")).click();

        WebElement confirmation_message = driver.findElement(By.name("confirmation_message"));

        String actualMessage = confirmation_message.getText();
        String expectedMessage = "Your e-mail's been sent!";

        if(actualMessage.equalsIgnoreCase(expectedMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        if(confirmation_message.isDisplayed()){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        driver.quit();


    }


}
