package com.next.stepdef;

import com.next.pageobjects.LogInPageObject;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInStepDef {
private LogInPageObject logInPageObject=new LogInPageObject();
    @When("^I click the myaccount link$")
    public void iClickTheMyaccountLink() {
        logInPageObject.singUp();
    }

    @And("^move to accont page$")
    public void moveToAccontPage() {

    }

    @Then("^I enter the email and pass word$")
    public void iEnterTheEmailAndPassWord() {

    }

    @Then("^I able to sign in$")
    public void iAbleToSignIn() {

    }
}

