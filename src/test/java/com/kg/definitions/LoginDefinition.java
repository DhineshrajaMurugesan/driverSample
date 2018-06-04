package com.kg.definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@RunWith(Cucumber.class)
public class LoginDefinition {
    public static WebDriver driver;

    @Given("^I am at  google page$")
    public void i_am_at_google_page()  {
        System.setProperty("webdriver.chrome.driver", "D:\\seleniumdrivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        driver = new ChromeDriver(options);
        driver.navigate().to("http://google.co.in");
    }

    @When("^I fill in selenium automation$")
    public void i_fill_in_selenium_automation()  {
        driver.findElement(By.id("lst-ib")).sendKeys("keysToSend"); 
        driver.get("https://www.office.com/"); 
        System.out.println("content"+driver.getPageSource());
        System.out.println(driver.getCurrentUrl());
        System.out.println("title"+driver.getTitle());
        System.out.println(driver.getWindowHandle()); 
        driver.manage();
       
    }

    @Then("^I press return key$")
    public void i_press_return_key()  {
        driver.quit();
    }

}