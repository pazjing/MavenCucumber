package com.cucumber.MavenCucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

/**
 * Created by jingbai on 6/17/17.
 */
public class pageTitle_step {

    WebDriver driver = null;

    @Given("^I am on Qrious website$")
    public void i_am_on_Qrious_website() throws Throwable {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1224,968));
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver.get("http://www.qrious.co.nz/");
    }

    /*@When("^I navigate to the \"([^\"]*)\"$")
    public void i_navigate_to_the(String arg1) throws Throwable {
        driver.findElement(By.id(arg1)).click();
    }

    @Then("^I check page title is \"([^\"]*)\"$")
    public void i_check_page_title_is(String title) throws Throwable {
        Assert.assertTrue(driver.getTitle().contains(title));
    }*/

    @And("^I close the browser$")
    public void i_close_the_browser() throws Throwable {
        driver.close();
    }

    @When("^I navigate to the ([^\"]*)$")
    public void i_navigate_to_the(String link) throws Throwable {
        driver.findElement(By.id(link)).click();
    }

    @Then("^I check page title is ([^\"]*)$")
    public void i_check_page_title_is(String title) throws Throwable {
        Assert.assertTrue(driver.getTitle().contains(title));
    }


    /**
     @Given("^I am on Qrious website$")
     public void i_am/_on_Qrious_website() throws Throwable {
     // Write code here that turns the phrase above into concrete actions
     driver = new ChromeDriver();
     System.setProperty("webdriver.chrome.driver","chromedriver");
     driver.get("http://www.qrious.co.nz/");
     }

     @When("^I navigate to the Contact$")
     public void i_navigate_to_the_Contact() throws Throwable {
     // Write code here that turns the phrase above into concrete actions
     driver.findElement(By.id("menu-item-209")).click();
     }

     @Then("^I check page title is Contact$")
     public void i_check_page_title_is_Contact() throws Throwable {
     // Write code here that turns the phrase above into concrete actions
     Assert.assertTrue(driver.getTitle().contains("Contact"));
     }

     @When("^I navigate to the About$")
     public void i_navigate_to_the_About() throws Throwable {
     // Write code here that turns the phrase above into concrete actions
     driver.findElement(By.id("menu-item-48")).click();
     }

     @Then("^I check page title is About$")
     public void i_check_page_title_is_About() throws Throwable {
     // Write code here that turns the phrase above into concrete actions
     Assert.assertTrue(driver.getTitle().contains("About"));
     }

     @When("^I navigate to the News$")
     public void i_navigate_to_the_News() throws Throwable {
     // Write code here that turns the phrase above into concrete actions
     driver.findElement(By.id("menu-item-24691")).click();
     }

     @Then("^I check page title is News$")
     public void i_check_page_title_is_News() throws Throwable {
     // Write code here that turns the phrase above into concrete actions
     Assert.assertTrue(driver.getTitle().contains("News"));
     }
     **/
}
