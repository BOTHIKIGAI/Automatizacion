package com.co.booking.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import com.co.booking.steps.loginStep;

public class loginStepDefinition {
    @Steps
    loginStep loginStep;

    // Open Browser
    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        loginStep.openBrowser();

    }

    // Login Succesful
    @When("the user enters the credentials")
    public void theUserEntersTheCredentials() {
        loginStep.CLOSEPOPPUPBUTTON();
        loginStep.CLICKLOGINBUTTON();
        loginStep.SENDKEYSINPUTMAIL();
        loginStep.CLICKENTERMAILBUTTON();
        loginStep.SENDKEYSPASSWORD();
        loginStep.CLICKBUTTONPASS();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Then("the user will see a captcha")
    public void theUserWillSeeACaptcha() {
        loginStep.FIND_HEADER_MESSAGECAPTCHA();
    }

    // Failed login due to insertion of numerical data
    @When("the user enters numbers in email")
    public void theUserEntersNumbersInEmail() {
        loginStep.CLOSEPOPPUPBUTTON();
        loginStep.CLICKLOGINBUTTON();
        loginStep.SENDKEYS_INPUTMAIL_NUMBER();
        loginStep.CLICKENTERMAILBUTTON();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // the user enter special characters in email

    @When("the user enter special characters in email")
    public void theUserEnterSpecialCharactersInEmail() {
        loginStep.CLOSEPOPPUPBUTTON();
        loginStep.CLICKLOGINBUTTON();
        loginStep.SENDKEYS_INPUTMAIL_SPECIALCHARACTERS();
        loginStep.CLICKENTERMAILBUTTON();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // the user enter wrong email

    @When("the user enter wrong email")
    public void theUserEnterWrongEmail() {
        loginStep.CLOSEPOPPUPBUTTON();
        loginStep.CLICKLOGINBUTTON();
        loginStep.SENDKEYS_INPUTMAIL_WRONGMAIL();
        loginStep.CLICKENTERMAILBUTTON();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // the user enter wrong pass

    @When("the user enter wrong pass")
    public void theUserEnterWrongPass() {
        loginStep.CLOSEPOPPUPBUTTON();
        loginStep.CLICKLOGINBUTTON();
        loginStep.SENDKEYSINPUTMAIL();
        loginStep.CLICKENTERMAILBUTTON();
        loginStep.SENDKEYS_WRONGPASSWORD();
        loginStep.CLICKBUTTONPASS();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // the user does not enter email

    @When("the user does not enter email")
    public void theUserDoesNotEnterEmail() {
        loginStep.CLOSEPOPPUPBUTTON();
        loginStep.CLICKLOGINBUTTON();
        loginStep.CLICKENTERMAILBUTTON();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // The user does not enter password

    @When("The user does not enter password")
    public void theUserDoesNotEnterPassword() {
        loginStep.CLOSEPOPPUPBUTTON();
        loginStep.CLICKLOGINBUTTON();
        loginStep.SENDKEYSINPUTMAIL();
        loginStep.CLICKENTERMAILBUTTON();
        loginStep.CLICKBUTTONPASS();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // Error Message
    @Then("The user will see an error on the page")
    public void TheUserWillSeeAnErrorOnThePage() {
        loginStep.FIND_HEADER_MESSAGEERROR();
    }


}
