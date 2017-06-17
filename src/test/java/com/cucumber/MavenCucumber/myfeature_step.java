package com.cucumber.MavenCucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by jingbai on 6/17/17.
 */
public class myfeature_step {

    @Given("^My first dummy feature scenario Given$")
    public void My_first_dummy_feature_scenario_Given() throws Throwable {
        System.out.println("Executed My first dummy feature scenario Given");
    }

    @When("^My first dummy feature scenario When$")
    public void My_first_dummy_feature_scenario_When() throws Throwable {
        System.out.println("Executed My first dummy feature scenario When");
    }

    @Then("^My first dummy feature scenario Then$")
    public void My_first_dummy_feature_scenario_Then() throws Throwable {
        System.out.println("Executed My first dummy feature scenario When");
    }
}
