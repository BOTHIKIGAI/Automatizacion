package com.co.booking.steptsdefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class contactusformStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Team15");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("the user is on the page")
    public void theUserIsOnThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com/"));
    }

    // Contact us form error - Empty

    @When("the user submits the form")
    public void theUserSubmitsTheForm() {

    }

    @Then("the user will see an error message on the page")
    public void theUserWillSeeAnErrorMessageOnThePage() {

    }

    // Contact us form error - Numbers

    @When("the user enters numbers in the input")
    public void theUserEntersNumbersInTheInput() {

    }

    // Contact us form error - Letters

    @When("the user enters a letters")
    public void theUserEntersALetters() {

    }

    // Contact us form error - Symbols

    @When("the user enters a symbols")
    public void theUserEntersASymbols() {

    }

    // Contact us form error - Alphanumeric

    @When("the user enters alphanumeric data")
    public void theUserEntersAlphanumericData() {

    }

    // Contact us form error - Email

    @When("the user enters his email")
    public void theUserEntersHisEmail() {

    }

    @Then("the user sees a confirmation message")
    public void theUserSeesAConfirmationMessage() {

    }

}
