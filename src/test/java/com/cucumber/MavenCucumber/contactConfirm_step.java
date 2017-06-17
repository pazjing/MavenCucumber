package com.cucumber.MavenCucumber;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by jingbai on 6/17/17.
 */
public class contactConfirm_step {


    WebDriver driver = null;

    @Before
    public void testSetUp() {
        System.out.println("Before Method executed");
        //driver = new ChromeDriver();
        //driver.manage().window().setSize(new Dimension(1224,968));
    }

    @After
    public void testShutDown() {
        System.out.println("After Method executed");
        //driver.close();
    }

    @Before("@web")
    public void testSetUpWeb() {
        System.out.println("Before Method for web tag executed");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1224,968));
    }

    @After("@web")
    public void testShutDownWeb() {
        System.out.println("After Method for web tag executed");
        driver.close();
    }

    @Given("^I am on my zoo website$")
    public void navigateToWebsite() throws Throwable {
        //driver = new ChromeDriver();
        //driver.manage().window().setSize(new Dimension(1224,968));
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver.get("http://www.qrious.co.nz/");
    }

    @When("^I click on the contact link$")
    public void ClickOnContactLink() throws Throwable {
        driver.findElement(By.id("menu-item-209")).click();
        System.out.println("I click on ClickOnContactLink");
    }

    @And("^Populate the contact form$")
    public void populateContactForm(DataTable table) throws Throwable {
        Assert.assertTrue(driver.getTitle().contains("Contact"));
        System.out.println(table);
        List<List<String>> data = table.raw();
        System.out.println(data.get(1));
    }

    @Then("^I should be on the contact confirmation page$")
    public void confirmPage() throws Throwable {
        System.out.println("I click on confirmPage");
        //driver.close();
    }

}
