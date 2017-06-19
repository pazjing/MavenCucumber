package com.cucumber.MavenCucumber;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by jingbai on 6/18/17.
 */
public class ZooTest_Abstract_step {

    protected static WebDriver driver;

    protected WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().setSize(new Dimension(1224,968));
            System.setProperty("webdriver.chrome.driver","chromedriver");
        }
        return driver;
    }

}
