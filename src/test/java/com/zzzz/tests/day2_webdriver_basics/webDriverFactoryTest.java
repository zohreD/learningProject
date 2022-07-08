package com.zzzz.tests.day2_webdriver_basics;

import com.zzzz.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class webDriverFactoryTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("explorer");
        driver.get("https://www.google.com");




    }

}
