package com.cucumber.MavenCucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by jingbai on 6/18/17.
 */
public class ZooTest_Common_step extends ZooTest_Abstract_step {

    WebDriver driver = getDriver();

    @Given("^I am on my zoo site$")
    public void I_am_on_the_zoo_site() throws Throwable {
       driver.get("http://www.thetestroom.com/webapp/");
    }

    @When("^I click on \"([^\"]*)\"$")
    public void I_click_on(String link) throws Throwable {
        driver.findElement(By.id(link.toLowerCase()+"_link")).click();
    }

    @Then("^I go to close the browser$")
    public void I_go_to_close_the_browser() throws Throwable {
        driver.close();
    }

}
