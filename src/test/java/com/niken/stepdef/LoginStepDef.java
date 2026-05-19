package com.niken.stepdef;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
    @Then("user is on homepage")
    public void userIsOnHomepage() {
    }

    @Given("user is on login page")
    public void userIsOnLoginPage() {
    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String username) {
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
    }

    @When("click login button")
    public void clickLoginButton() {
    }

    @And("user see error message")
    public void userSeeErrorMessage() {
    }
}
