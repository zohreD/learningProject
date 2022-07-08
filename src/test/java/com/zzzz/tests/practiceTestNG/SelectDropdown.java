package com.zzzz.tests.practiceTestNG;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.zzzz.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropdown {

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com/");

    }

    @Test
    public void test1() throws InterruptedException {

        WebElement dropdownElement = driver.findElement(By.id("gh-cat"));

        Select dropdown = new Select(dropdownElement);

        System.out.println(dropdown.getFirstSelectedOption().getText());
        System.out.println(dropdown.getOptions().size());
        List<WebElement> dropdownOptions = dropdown.getOptions();

        dropdown.selectByValue("11700");


        String expected = "Home & Garden";
        String actual = dropdown.getFirstSelectedOption().getText();
        System.out.println(actual);
        Assert.assertTrue(dropdown.getFirstSelectedOption().isSelected(), "verify it is selected");
        Assert.assertEquals(actual,expected, "verify they are equal");


    }
    @Test
    public void test2(){
        Actions actions = new Actions(driver);

        WebElement MyeBayTarget = driver.findElement(By.id("gh-eb-My"));

        actions.moveToElement(MyeBayTarget).perform();


        List<WebElement> dropdownElements = driver.findElements(By.xpath("//li/a[@class='gh-eb-oa thrd']"));

        System.out.println(dropdownElements.size());
        for (WebElement dropdownElement : dropdownElements) {
            System.out.println(dropdownElement.getText());

        }


    }

}
