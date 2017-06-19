package com.cucumber.MavenCucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by jingbai on 6/18/17.
 */
public class ZooTest_step {

  /*  WebDriver driver = null;

    @Given("^I am on my zoo site$")
    public void I_am_on_the_zoo_site() throws Throwable {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1224,968));
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver.get("http://www.thetestroom.com/webapp/");
    }

    @When("^I click on \"([^\"]*)\"$")
    public void I_click_on(String link) throws Throwable {
        driver.findElement(By.id(link.toLowerCase()+"_link")).click();
    }

    @Then("^I set the start date to \"([^\"]*)\"$")
    public void I_set_the_start_date_to(String dropItem) throws Throwable {
        Select dropDown = new Select(driver.findElement(By.id("start_select")));
        dropDown.selectByVisibleText(dropItem);
    }

    @Then("^I go to close the browser$")
    public void I_go_to_close_the_browser() throws Throwable {
        driver.close();
    } */

  /*  @Then("^I populate the contact form$")
    public void I_populate_the_contact_form() throws Throwable {
        driver.findElement(By.name("name_field")).sendKeys("test name");
        driver.findElement(By.id("rdona")).click();
        driver.findElement(By.id("cadop")).click();
    }*/

}
