package com.co.booking.steptsdefinitions;

import com.co.booking.task.RegisterFailNumbers;
import com.co.booking.task.Reservation;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ReservationStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Team15");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @When("the user enters his credentials and searched for the reservation")
    public void theUserEntersHisCredentialsAndSearchedForTheReservation() {
        OnStage.theActorInTheSpotlight().attemptsTo(Reservation.enterCredentialsReservation());


    }
    @Then("the user can see the reservation cancellation interface")
    public void theUserCanSeeTheReservationCancellationInterface() {

    }


}
