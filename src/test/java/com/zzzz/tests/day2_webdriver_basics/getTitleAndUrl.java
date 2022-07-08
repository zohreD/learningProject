package com.zzzz.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitleAndUrl {


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");

        String title = driver.getTitle();
        System.out.println(title);

        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        driver.close();
        driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/open_new_tab");


        driver.quit();




    }

}
