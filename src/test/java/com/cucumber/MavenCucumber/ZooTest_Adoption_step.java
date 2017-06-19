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
public class ZooTest_Adoption_step extends ZooTest_Abstract_step{

    WebDriver driver = getDriver();

    @Then("^I set the start date to \"([^\"]*)\"$")
    public void I_set_the_start_date_to(String dropItem) throws Throwable {
        Select dropDown = new Select(driver.findElement(By.id("start_select")));
        dropDown.selectByVisibleText(dropItem);
    }


}
